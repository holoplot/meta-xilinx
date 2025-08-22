SUMMARY = "Xen u-boot script generation using image builder"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit deploy

DEPENDS += " \
	image-builder-native \
	bash \
	"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE ?= "^$"
COMPATIBLE_MACHINE:aarch64 = "aarch64"

# Default XEN_TEMPLATE_CONFIG is set to u-boot-xen-scr-dom0-template-cfg file
# User can change to u-boot-xen-scr-dom0-template-cfg or a custom config.

XEN_TEMPLATE_CONFIG ?= "u-boot-xen-scr-dom0-template-cfg"

SRC_URI = " \
    file://${XEN_TEMPLATE_CONFIG} \
    "

do_configure[noexec] = "1"

do_compile(){
    ${DEPLOY_DIR_IMAGE}/scripts/uboot-script-gen -c ${WORKDIR}/${XEN_TEMPLATE_CONFIG} -s -d ${WORKDIR} -o ${WORKDIR}/xen_boot
}

do_install() {
	install -d ${D}/boot
	install -m 0644 ${WORKDIR}/xen_boot.scr ${D}/boot
}

do_deploy() {
	install -d ${DEPLOYDIR}
	install -m 0644 ${WORKDIR}/xen_boot.scr ${DEPLOYDIR}
}

FILES:${PN} = "/boot/*"

addtask do_deploy after do_compile before do_build
