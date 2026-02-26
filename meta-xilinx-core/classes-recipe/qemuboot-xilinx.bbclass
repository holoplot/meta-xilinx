
# enable the overrides for the context of the conf only
OVERRIDES .= ":qemuboot-xilinx"

# Default machine targets for Xilinx QEMU (FDT Generic)
QB_RNG=""

DEFAULT_QB_SYSTEM_NAME = "qemu-system-aarch64-multiarch"
DEFAULT_QB_SYSTEM_NAME:microblaze = "qemu-system-microblazeel"
DEFAULT_QB_SYSTEM_NAME:microblaze-v:riscv32 = "qemu-system-riscv32"
DEFAULT_QB_SYSTEM_NAME:microblaze-v:riscv64 = "qemu-system-riscv64"
DEFAULT_QB_SYSTEM_NAME:zynq = "qemu-system-aarch64"
QB_SYSTEM_NAME ?= "${DEFAULT_QB_SYSTEM_NAME}"

QB_DEFAULT_FSTYPE ?= "${@qemu_rootfs_params(d,'fstype')}"
QB_ROOTFS ?= "${@qemu_rootfs_params(d,'rootfs')}"
QB_ROOTFS_OPT ?= "${@qemu_rootfs_params(d,'rootfs-opt')}"
QB_DTB ?= "${@qemu_default_dtb(d)}"

# https://docs.amd.com/r/en-US/ug585-zynq-7000-SoC-TRM/Boot-Mode-Pin-Settings
# https://docs.amd.com/r/en-US/ug1085-zynq-ultrascale-trm/Boot-Modes
# https://docs.amd.com/r/en-US/am011-versal-acap-trm/Primary-Boot-Interfaces-Table
# https://docs.amd.com/r/en-US/am026-versal-ai-edge-prime-gen2-trm/Primary-Boot-Interfaces-Table
QEMU_HW_BOOT_MODE ?= "${HW_BOOT_MODE}"


# ZynqMP or Versal SD and eMMC drive index.
# Note: Do not set drive index based on boot mode some boards may have primary
#       boot mode as QSPI/OSPI and secondary boot mode as SD/eMMC.
#
# SoC                         Device                      Drive Index
# Zynq-7000, ZynqMP, Versal   SD0                         0
# ZynqMP, Versal              SD1                         1
# ZynqMP, Versal              eMMC0(secondary boot only)  2
# ZynqMP, Versal              eMMC1                       3

QEMU_HW_SD_DRIVE_INDEX ?= "1"
QEMU_HW_SD_DRIVE_INDEX:zynq ?= "0"
QEMU_HW_SD_DRIVE_INDEX:versal-net ?= "0"

inherit_defer qemuboot

def qemu_add_extra_args(data):
    initramfs_image = data.getVar('INITRAMFS_IMAGE') or ""
    bundle_image = data.getVar('INITRAMFS_IMAGE_BUNDLE') or ""
    deploy_dir = data.getVar('DEPLOY_DIR_IMAGE') or ""
    machine_name = data.getVar('MACHINE') or ""
    soc_family = data.getVar('SOC_FAMILY') or ""
    boot_mode = data.getVar('QEMU_HW_BOOT_MODE') or ""
    qb_extra_args = ''
    # Add kernel image and boot.scr to qemu boot command when initramfs_image supplied
    kernel_name = ''
    bootscr_image = '%s/boot.scr' % deploy_dir
    if soc_family in ('zynqmp', 'versal', 'versal-net', 'versal-2ve-2vm'):
        kernel_name = 'Image'
        bootscr_loadaddr = '0x20000000'
    if initramfs_image:
        kernel_image = '%s/%s' % (deploy_dir, kernel_name)
        if bundle_image == "1":
            kernel_image = '%s/%s-initramfs-%s.bin' % (deploy_dir, kernel_name, machine_name)
        kernel_loadaddr = '0x200000'
        if kernel_name:
            qb_extra_args = ' -device loader,file=%s,addr=%s,force-raw=on' % (kernel_image, kernel_loadaddr)
            qb_extra_args += ' -device loader,file=%s,addr=%s,force-raw=on' % (bootscr_image, bootscr_loadaddr)
        if soc_family in ('zynqmp', 'versal', 'versal-net', 'versal-2ve-2vm'):
            qb_extra_args += ' -boot mode=%s' % boot_mode
    else:
        if soc_family in ('zynqmp', 'versal', 'versal-net', 'versal-2ve-2vm'):
            qb_extra_args = ' -boot mode=%s' % boot_mode
    return qb_extra_args

def qemu_rootfs_params(data, param):
    initramfs_image = data.getVar('INITRAMFS_IMAGE') or ""
    bundle_image = data.getVar('INITRAMFS_IMAGE_BUNDLE') or ""
    soc_family = data.getVar('SOC_FAMILY') or ""
    tune_features = (data.getVar('TUNE_FEATURES') or '').split()
    sd_index = data.getVar('QEMU_HW_SD_DRIVE_INDEX') or ""
    if 'microblaze' in tune_features:
        soc_family = 'microblaze'
    elif 'rv' in tune_features:
        soc_family = 'microblaze-v'

    if param == 'rootfs':
        return 'none' if bundle_image == "1" else ''

    elif param == 'fstype':
        fstype_dict = {
            "microblaze": "cpio.gz",
            "microblaze-v": "ext4",
            "zynq": "cpio.gz",
            "zynqmp": "cpio.gz.u-boot",
            "versal": "cpio.gz.u-boot.qemu-sd-fatimg",
            "versal-net": "cpio.gz.u-boot.qemu-sd-fatimg",
            "versal-2ve-2vm": "cpio.gz.u-boot.qemu-sd-fatimg"
        }
        if not initramfs_image:
            image_fs = (data.getVar('IMAGE_FSTYPES') or '').split()
            if 'wic.qemu-sd' in image_fs:
                return 'wic.qemu-sd'
        if soc_family not in fstype_dict:
            return ""
        return fstype_dict[soc_family]

    elif param == 'rootfs-opt':
        # Device is using a disk
        if not initramfs_image:
            return ' -drive if=sd,index=%s,file=@ROOTFS@,format=raw' % (sd_index)

        # Device is using a ramdisk
        if soc_family not in ('zynq', 'microblaze'):
            return ' -device loader,file=@ROOTFS@,addr=0x04000000,force-raw=on'

        # Ramdisk must be compiled into the kernel
        return ''

def qemu_default_dtb(d):
    # device trees (device-tree only), these are first as they are likely desired over the kernel ones
    if "device-tree" in (d.getVar("PREFERRED_PROVIDER_virtual/dtb") or ""):
        return "system.dtb"

    # device trees (kernel only)
    if d.getVar("KERNEL_DEVICETREE"):
        dtbs = d.getVar("KERNEL_DEVICETREE").split(" ")
        dtbs = [os.path.basename(d) for d in dtbs]
        return dtbs[0]

    return ""

def qemu_default_serial(data):
    if data.getVar("SERIAL_CONSOLES", True):
        first_console = data.getVar("SERIAL_CONSOLES", True).split(" ")[0]
        speed, console = first_console.split(";", 1)
        # zynqmp uses earlycon and stdout (in dtb)
        if "zynqmp" in data.getVar("MACHINEOVERRIDES", True).split(":"):
            return ""
        return "console=%s,%s earlyprintk" % (console, speed)
    return ""

def qemu_zynqmp_unhalt(data, multiarch):
    if multiarch:
        return "-global xlnx,zynqmp-boot.cpu-num=0 -global xlnx,zynqmp-boot.use-pmufw=true"
    return "-device loader,addr=0xfd1a0104,data=0x8000000e,data-len=4 -device loader,addr=0xfd1a0104,data=0x8000000e,data-len=4"
