SUMMARY = "Helper scripts for executing a multi-arch instance of Xilinx QEMU"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit setuptools3 native

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

require qemu-xilinx-multiarch-helper.inc

S = "${WORKDIR}/git"
B = "${S}"

SYSROOT_DIRS += "${bindir}/qemu-xilinx"

do_install:append() {
	install -Dm 0755 ${S}/qemu-system-amd-fpga-multiarch ${D}${bindir}/qemu-system-amd-fpga-multiarch
	install -Dm 0755 ${S}/flash_stripe.py ${D}${bindir}/flash_stripe.py
}

