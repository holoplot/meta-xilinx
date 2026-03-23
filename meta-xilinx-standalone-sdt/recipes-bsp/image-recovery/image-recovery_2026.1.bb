SUMMARY = "Image Recovery"
DESCRIPTION = "Image Recovery binary deploy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit esw python3native deploy bootgen-bif

IMG_RCVRY_DEPENDS ??= ""
IMG_RCVRY_DEPENDS:zynqmp ??= "libxil xiltimer lwip xilffs bootgen-native"
DEPENDS += "${IMG_RCVRY_DEPENDS}"

IMG_RCVRY_REPO ??= "git://github.com/Xilinx/image-recovery.git;protocol=https"

IMG_RCVRY_BRANCH ??= "main"
IMG_RCVRY_BRANCHARG = "${@['nobranch=1', 'branch=${IMG_RCVRY_BRANCH}'][d.getVar('IMG_RCVRY_BRANCH') != '']}"

ESW_COMPONENT_SRC = "/src/"
ESW_EXECUTABLE_NAME = "img_rcvry"

SRC_URI:append = " ${IMG_RCVRY_REPO};${IMG_RCVRY_BRANCHARG};destsuffix=image-recovery;name=image-recovery"
SRCREV_image-recovery = "89ae11105c20c3398a6ce9a3406bb95ed4d85ce3"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:k26-smk-kr-sdt = "${MACHINE}"
COMPATIBLE_MACHINE:k26-smk-kv-sdt = "${MACHINE}"
COMPATIBLE_MACHINE:k24-smk-kd-sdt = "${MACHINE}"

RCONFLICTS:${PN} = "image-recovery-linux"

do_generate_app_data() {
    lopper ${DTS_FILE} -- bmcmake_metadata_xlnx.py ${ESW_MACHINE} ${WORKDIR}/${BPN}/${ESW_COMPONENT_SRC} hwcmake_metadata ${S}
    install -m 0644 *.cmake ${WORKDIR}/${BPN}/${ESW_COMPONENT_SRC}/
}
do_generate_app_data[dirs] = "${S}"
addtask do_generate_app_data before do_configure after do_prepare_recipe_sysroot
do_prepare_recipe_sysroot[rdeptask] = "do_unpack"

do_configure:prepend() {
    (
    cd ${S}
    lopper ${DTS_FILE} -- baremetallinker_xlnx.py ${ESW_MACHINE} ${WORKDIR}/${BPN}/${ESW_COMPONENT_SRC}
    install -m 0755 *.cmake ${WORKDIR}/${BPN}/${ESW_COMPONENT_SRC}/
    install -m 0644 ${S}/cmake/UserConfig.cmake ${WORKDIR}/${BPN}/${ESW_COMPONENT_SRC}
    )
}

OECMAKE_SOURCEPATH = "${WORKDIR}/${BPN}/${ESW_COMPONENT_SRC}"

WEBIMG_DIR ?= "${B}/webimg"
WEBIMG_FILE ?= "${WEBIMG_DIR}/web.img"
do_create_webimg() {
    dd if=/dev/zero of=${WEBIMG_FILE} bs=512 count=192
    mkfs.vfat -F 12 ${WEBIMG_FILE}
    mcopy -i ${WEBIMG_FILE} -s ${WORKDIR}/image-recovery/misc/web_pages/* ::
    chmod 444 ${WEBIMG_FILE}
}
do_create_webimg[cleandirs] = "${WEBIMG_DIR}"
do_create_webimg[depends] += "dosfstools-native:do_populate_sysroot mtools-native:do_populate_sysroot"

addtask do_create_webimg after do_compile before do_generate_bif

BIF_FILE_PATH = "${B}/${PN}.bif"

BIF_PARTITION_ATTR = "fsbl web-img imgrcvry-elf"

FSBL_IMAGE_NAME ??= "fsbl-${MACHINE}"

BIF_PARTITION_ATTR[fsbl] = "bootloader, destination_cpu=a53-0"
BIF_PARTITION_IMAGE[fsbl] = "${FSBL_DEPLOY_DIR}/${FSBL_IMAGE_NAME}.elf"

BIF_PARTITION_ATTR[web-img] = "load=0x10000000"
BIF_PARTITION_IMAGE[web-img] = "${WEBIMG_FILE}"

BIF_PARTITION_ATTR[imgrcvry-elf] = "destination_cpu=a53-0"
BIF_PARTITION_IMAGE[imgrcvry-elf] = "${B}/${ESW_EXECUTABLE_NAME}.elf"

python do_generate_bif() {
    bootgen_bif_generate(d)
}
IMGRCVRY_BIF_MCDEPENDS ?= ""
IMGRCVRY_BIF_MCDEPENDS:zynqmp ?= "${FSBL_MCDEPENDS}"
do_generate_bif[mcdepends] += "${IMGRCVRY_BIF_MCDEPENDS}"
do_generate_bif[vardeps] += "BIF_PARTITION_ATTR BIF_PARTITION_IMAGE BIF_FILE_PATH"

addtask do_generate_bif after do_create_webimg before do_generate_rcvry_bin

do_generate_rcvry_bin () {
    bootgen -image ${BIF_FILE_PATH} -arch ${BOOTGEN_ARCH} -w -o ${B}/${PN}.bin
}
do_generate_rcvry_bin[dirs] = "${B}"
do_generate_rcvry_bin[depends] += "bootgen-native:do_populate_sysroot"

addtask do_generate_rcvry_bin after do_generate_bif before do_install

do_install () {
    :
}

do_deploy() {
    install -m 0644 ${B}/${PN}.bin ${DEPLOYDIR}/${PN}-${MACHINE}.bin
    ln -sf ${PN}-${MACHINE}.bin ${DEPLOYDIR}/${PN}.bin
}

addtask deploy before do_build after do_install

python() {
    current_mc = d.getVar('BB_CURRENT_MC')

    # Fix FSBL_DEPLOY_DIR for non-default multiconfig
    # FSBL_DEPLOY_DIR from machine conf uses ${TMPDIR} which in a non-default MC
    # expands with the current MC suffix appended. Strip it to get the base TMPDIR.
    fsbl_deploy = d.getVar('FSBL_DEPLOY_DIR')
    if fsbl_deploy and current_mc and current_mc != 'default':
        tmpdir = d.getVar('TMPDIR')
        mc_suffix = '-' + current_mc
        if tmpdir.endswith(mc_suffix):
            base_tmpdir = tmpdir[:-len(mc_suffix)]
            d.setVar('FSBL_DEPLOY_DIR', fsbl_deploy.replace(tmpdir, base_tmpdir, 1))

    # Fix the mcdepends dependency format: mc:from-mc:to-mc:recipe:task
    # If the value is 'mc::' we'll adjust it to be mc:BB_CURRENT_MC: (temporary workaround)
    # If the value is 'mc:default:' we'll adjust it to be mc:: (temporary workaround for bitbake bug)
    mcdepend = d.getVar('IMGRCVRY_BIF_MCDEPENDS')
    if mcdepend:
        if current_mc == 'default':
            d.setVar('IMGRCVRY_BIF_MCDEPENDS', mcdepend.replace('mc:default:', 'mc::'))
        else:
            d.setVar('IMGRCVRY_BIF_MCDEPENDS', mcdepend.replace('mc::', 'mc:${BB_CURRENT_MC}:'))
}
