SUMMARY = "Linux kernel module for Video Code Unit"
DESCRIPTION = "Out-of-tree VCU decoder, encoder and common kernel modules provider for MPSoC EV devices"
SECTION = "kernel/modules"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eb723b61539feef013de476e68b5c50a"

PV .= "+git"

S = "${WORKDIR}/git"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

BRANCH = "master"
REPO = "git://github.com/Xilinx/vcu2-modules.git;protocol=https"
SRCREV = "6c02718b50c9c4ed6125493b5398847ec1852e8b"

BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = " \
    ${REPO};${BRANCHARG} \
    file://99-vcu2-codec.rules \
    "

inherit module features_check

REQUIRED_MACHINE_FEATURES = "vcu2"

EXTRA_OEMAKE += "O=${STAGING_KERNEL_BUILDDIR} KDIR=${STAGING_KERNEL_BUILDDIR}"

RDEPENDS:${PN} = "vcu2-firmware"

do_install:append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/99-vcu2-codec.rules ${D}${sysconfdir}/udev/rules.d/
}

FILES:${PN} = "${sysconfdir}/udev/rules.d/*"

SKIP_RECIPE[kernel-module-vcu2] = "${@'Only kernel 6.12 and before are supported.' if bb.utils.vercmp_string(d.getVarFlag('XILINX_LINUX_VERSION', d.getVar('XILINX_RELEASE_VERSION')) or 'undefined', "6.13") >= 0 else ''}"
