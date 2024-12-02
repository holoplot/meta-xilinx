# Image types class to generate the image-recovery bin file

IMAGE_TYPES += "imagercvry"

include recipes-bsp/bootbin/machine-xilinx-${SOC_FAMILY}.inc

IMGRCVRY_ATTR ?= "${BIF_PARTITION_ATTR}"
IMGRCVRY_KERNEL_ATTR ?= "linux-xlnx rootfs"

# specify BIF partition attributes for linux-xlnx
BIF_PARTITION_ATTR[linux-xlnx] ?= "type=raw, load=0x200000"
BIF_PARTITION_IMAGE[linux-xlnx] ?= "${DEPLOY_DIR_IMAGE}/Image.gz"
BIF_PARTITION_ID[linux-xlnx] ?= "0x1c000000"

# specify BIF partition attributes for tiny-rootfs
BIF_PARTITION_ATTR[rootfs] ?= "type=raw, load=0x4000000"
BIF_PARTITION_IMAGE[rootfs] ?= "${IMGDEPLOYDIR}/${IMAGE_LINK_NAME}.cpio.gz.u-boot"
BIF_PARTITION_ID[rootfs] ?= "0x1c000000"

BOOTGEN_ARCH_DEFAULT:zynqmp = "zynqmp"
BOOTGEN_ARCH_DEFAULT:versal = "versal"
BOOTGEN_ARCH ?= "${BOOTGEN_ARCH_DEFAULT}"

IMGRCVRY_BIFFILE ?= "${B}/imgrcvry.bif"


def write_versal_bif(bifpartition, attrflags, attrimage, ids, d):
    idcode_dict = {}
    for attr in bifpartition:
        attr_path = d.expand(attrimage[attr])
        attr_flags = d.expand(attrflags[attr])
        if attr and attr_flags:
            bifstr = "\t { %s, file=%s }\n" % (attr_flags, attr_path)
            try:
                id = d.expand(ids[attr])
            except:
                id = '0'
            try:
                idcode_dict[id] += bifstr
            except:
                idcode_dict[id] = bifstr

    biffile_str = 'the_imgrcvry_image:\n'
    biffile_str += '{\n'
    for id, string in idcode_dict.items():
        biffile_str += '\timage {\n'
        if id != '0':
            biffile_str += '\t id = ' + id + '\n'
        biffile_str += string
        biffile_str += '\t}\n'
    biffile_str += '}\n'

    return biffile_str


python do_imgrcvry_bif () {
    bifpartition = (d.getVar("IMGRCVRY_ATTR") or "").split()
    bifpartition += (d.getVar("IMGRCVRY_KERNEL_ATTR") or "").split()
    attrflags = d.getVarFlags("BIF_PARTITION_ATTR") or {}
    attrimage = d.getVarFlags("BIF_PARTITION_IMAGE") or {}
    ids = d.getVarFlags("BIF_PARTITION_ID") or {}
   
    soc_family = d.getVar('SOC_FAMILY')
    biffile_str = ''
    if soc_family in ('versal'):
        biffile_str = write_versal_bif(bifpartition, attrflags, attrimage, ids, d)
    else:
        pass
    import os
    with open(d.getVar('IMGRCVRY_BIFFILE'), 'w') as f:
        f.write(biffile_str)
    f.close()
}


IMAGE_CMD:imagercvry () {
	bootgen -image ${IMGRCVRY_BIFFILE} -arch ${BOOTGEN_ARCH} -w -o ${IMGDEPLOYDIR}/${IMAGE_NAME}.imgrcry.bin
	cd ${IMGDEPLOYDIR}
	if [ -e ${IMAGE_NAME}.imgrcry.bin ]; then
		ln -sf ${IMAGE_NAME}.imgrcry.bin ${IMAGE_LINK_NAME}.imgrcry.bin
	fi
}

addtask do_imgrcvry_bif after do_image before do_image_imagercvry

do_imgrcvry_bif[vardeps] += "IMGRCVRY_ATTR IMGRCVRY_BIFFILE IMGRCVRY_KERNEL_ATTR BIF_PARTITION_IMAGE BIF_COMMON_ATTR BIF_PARTITION_ID"

IMGRCVRY_ATTR_DEP = "${@(d.getVar('IMGRCVRY_ATTR') or "").replace('arm-trusted-firmware', 'virtual/arm-trusted-firmware')}"
do_image_imagercvry[depends] += "${@' '.join('%s:do_populate_sysroot' % r for r in d.getVar('IMGRCVRY_ATTR_DEP').split())}"
do_image_imagercvry[depends] += "bootgen-native:do_populate_sysroot virtual/kernel:do_deploy u-boot-xlnx-scr:do_deploy"

IMAGE_TYPEDEP:imagercvry = "cpio.gz.u-boot"
