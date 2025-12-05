# SPDX-License-Identifier: MIT
#
# bootgen-bif.bbclass - Generate BIF files for AMD/Xilinx bootgen tool
#
# Generates Boot Image Format (BIF) files for bootgen to create BOOT.bin/PDI.
# See AMD UG1283 "Bootgen User Guide" for the complete BIF specification.
#
# Supported: zynq, zynqmp, versal, versal-net, versal-2ve-2vm
#
# Variables:
#   BIF_FILE_PATH          - Output path for generated BIF file
#   BIF_COMMON_ATTR        - Space-separated common attribute names
#   BIF_COMMON_ATTR[name]  - Flags for common attribute
#   BIF_OPTIONAL_DATA      - Semicolon-separated: "<filepath>, id=<id>;"
#   BIF_PARTITION_ATTR     - Space-separated partition names (boot order)
#   BIF_PARTITION_ATTR[p]  - Attribute flags for partition 'p'
#   BIF_PARTITION_IMAGE[p] - File path for partition 'p'
#   BIF_PARTITION_ID[p]    - Subsystem ID for partition 'p' (Versal only)
#   BIF_PARTITION_NAME[id] - Subsystem name for ID (Versal only)
#
# Note: All partition and optional-data files are copied to workdir by basename.
# Two files with the same basename (e.g., /a/fw.elf and /b/fw.elf) will fail
# with a collision error. Empty partition files are skipped with a warning.
#

def bootgen_bif_create_zynq(common_attrs, partitions, local_files, biffd, d):
    """Generate BIF content for Zynq/ZynqMP (flat partition list)."""

    common_attrflags = d.getVarFlags("BIF_COMMON_ATTR") or {}
    partition_attrflags = d.getVarFlags("BIF_PARTITION_ATTR") or {}

    for name in common_attrs:
        if name not in common_attrflags:
            bb.fatal("BIF_COMMON_ATTR[%s] not defined, but '%s' is listed in BIF_COMMON_ATTR" % (name, name))
        flags = d.expand(common_attrflags[name])
        flag_list = [f.strip() for f in flags.split(',') if f.strip()]
        biffd.write("\t [%s] %s\n" % (name, ', '.join(flag_list)))

    # Process partitions that were successfully copied (uses local basenames)
    for name in partitions:
        if name not in local_files:
            continue
        filepath = local_files[name]
        flags = d.expand(partition_attrflags.get(name, ''))
        if flags:
            flag_list = [f.strip() for f in flags.split(',') if f.strip()]
            biffd.write("\t [%s] %s\n" % (', '.join(flag_list), filepath))
        else:
            biffd.write("\t %s\n" % filepath)

def bootgen_bif_create_versal(common_attrs, partitions, local_files, biffd, d):
    """
    Generate BIF content for Versal (partitions grouped into image blocks by ID).

    Partitions with the same BIF_PARTITION_ID are grouped together.
    ID '0' is the default anonymous image; non-zero IDs get explicit id/name lines.
    """

    common_attrflags = d.getVarFlags("BIF_COMMON_ATTR") or {}
    partition_attrflags = d.getVarFlags("BIF_PARTITION_ATTR") or {}
    partition_ids = d.getVarFlags("BIF_PARTITION_ID") or {}

    for name in common_attrs:
        if name not in common_attrflags:
            bb.fatal("BIF_COMMON_ATTR[%s] not defined, but '%s' is listed in BIF_COMMON_ATTR" % (name, name))
        flags = d.expand(common_attrflags[name])
        flag_list = [f.strip() for f in flags.split(',') if f.strip()]
        biffd.write("\t { %s %s }\n" % (name, ', '.join(flag_list)))

    # Group partitions by ID, preserving order of first occurrence
    id_partitions = []  # [(id, [entries]), ...]
    id_seen = {}        # id -> index in id_partitions

    for name in partitions:
        # Versal requires flags for all partitions
        flags = partition_attrflags.get(name, '')
        if not flags:
            bb.note("Partition '%s' skipped: no BIF_PARTITION_ATTR[%s] flags defined" % (name, name))
            continue

        # Skip partitions that weren't copied (empty files)
        if name not in local_files:
            continue

        filepath = local_files[name]
        flags = d.expand(flags)

        partition_id = d.expand(partition_ids.get(name, '0'))
        flag_list = [f.strip() for f in flags.split(',') if f.strip()]
        partition_entry = "\t { %s, file=%s }\n" % (', '.join(flag_list), filepath)

        if partition_id in id_seen:
            id_partitions[id_seen[partition_id]][1].append(partition_entry)
        else:
            id_seen[partition_id] = len(id_partitions)
            id_partitions.append((partition_id, [partition_entry]))

    # Write image blocks
    for partition_id, entries in id_partitions:
        biffd.write("\timage {\n")
        if partition_id != '0':
            subsys_name = d.getVarFlag("BIF_PARTITION_NAME", partition_id) or "apu_ss"
            biffd.write("\t id = %s, name=%s\n" % (partition_id, subsys_name))
        for entry in entries:
            biffd.write(entry)
        biffd.write("\t}\n")

def bootgen_bif_write_optional_data(biffd, optional_data, workdir, seen_basenames, d):
    """
    Process BIF_OPTIONAL_DATA entries and copy files to workdir.

    Format: "<filepath>, id=<id>;" (semicolon-separated)
    Common IDs: 0x21=version string, 0x22=user data, 0x23=PDI unique ID

    Updates seen_basenames dict to track copied files (shared with partition copy).
    """

    import os
    import shutil

    for entry in optional_data.split(';'):
        entry = entry.strip()
        if not entry:
            continue

        try:
            filepath, id_part = entry.split(',', 1)
            filepath = d.expand(filepath.strip())
            id_part = id_part.strip()
        except ValueError:
            bb.fatal('BIF_OPTIONAL_DATA entry "%s" invalid, expected: <filepath>, id=<id>' % entry)

        if not os.path.exists(filepath):
            bb.fatal('BIF_OPTIONAL_DATA file does not exist: %s' % filepath)

        basename = os.path.basename(filepath)
        if basename in seen_basenames:
            bb.fatal("Basename collision: '%s' from BIF_OPTIONAL_DATA entry '%s' "
                     "would overwrite file from %s" % (basename, entry, seen_basenames[basename]))
        seen_basenames[basename] = "BIF_OPTIONAL_DATA entry '%s'" % entry

        dest = os.path.join(workdir, basename)
        shutil.copyfile(filepath, dest)
        biffd.write("\toptionaldata { %s, %s }\n" % (basename, id_part))

def bootgen_bif_copy_partition_files(partitions, partition_attrimage, workdir, seen_basenames, d):
    """
    Copy partition files to workdir for bootgen.

    Returns dict mapping partition name to local basename. Empty files are
    skipped with a warning. Updates seen_basenames dict (shared with optional-data).
    Raises bb.fatal on basename collision or missing files.
    """

    import os
    import shutil

    local_files = {}

    for name in partitions:
        if name not in partition_attrimage:
            bb.fatal("BIF_PARTITION_IMAGE[%s] not defined, but '%s' is listed in BIF_PARTITION_ATTR" % (name, name))

        filepath = d.expand(partition_attrimage[name])
        if not os.path.exists(filepath):
            bb.fatal("Partition file does not exist: %s" % filepath)

        # Skip empty files with warning (matches original behavior)
        if os.stat(filepath).st_size == 0:
            bb.warn("Empty file %s, excluding from BIF" % filepath)
            continue

        basename = os.path.basename(filepath)
        if basename in seen_basenames:
            bb.fatal("Basename collision: '%s' from BIF_PARTITION_IMAGE[%s] (%s) "
                     "would overwrite file from %s" %
                     (basename, name, filepath, seen_basenames[basename]))
        seen_basenames[basename] = "BIF_PARTITION_IMAGE[%s]" % name

        dest = os.path.join(workdir, basename)
        bb.note("Copying BIF_PARTITION_IMAGE[%s]: %s -> %s" % (name, filepath, dest))
        shutil.copyfile(filepath, dest)
        local_files[name] = basename

    return local_files

def bootgen_bif_generate(bif_path, workdir, d):
    """
    Generate a complete BIF file based on BIF_* variables.

    Main entry point. Copies partition files to workdir and generates
    arch-specific BIF content using the local basenames.
    """

    soc_family = d.getVar("SOC_FAMILY") or ""

    # Shared basename tracker to detect collisions between optional-data and partitions
    seen_basenames = {}  # basename -> description string for error messages

    with open(bif_path, 'w') as biffd:
        biffd.write("the_ROM_image:\n")
        biffd.write("{\n")

        # Optional data (Versal version strings, user data)
        optional_data = d.getVar("BIF_OPTIONAL_DATA") or ""
        if optional_data:
            bootgen_bif_write_optional_data(biffd, optional_data, workdir, seen_basenames, d)

        common_attrs = (d.getVar("BIF_COMMON_ATTR") or "").split()
        partitions = (d.getVar("BIF_PARTITION_ATTR") or "").split()

        # Copy files and get list of valid (non-empty) partitions
        partition_attrimage = d.getVarFlags("BIF_PARTITION_IMAGE") or {}
        local_files = bootgen_bif_copy_partition_files(partitions, partition_attrimage, workdir, seen_basenames, d)

        if not local_files:
            bb.fatal("No valid partition files found - cannot generate BIF")

        if soc_family in ('zynq', 'zynqmp'):
            bootgen_bif_create_zynq(common_attrs, partitions, local_files, biffd, d)
        elif soc_family in ('versal', 'versal-net', 'versal-2ve-2vm'):
            bootgen_bif_create_versal(common_attrs, partitions, local_files, biffd, d)
        else:
            bb.fatal("bootgen_bif_generate: unsupported SOC_FAMILY '%s'" % soc_family)

        biffd.write("}")
