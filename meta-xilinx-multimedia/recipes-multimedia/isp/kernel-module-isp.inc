SUMMARY = "Xilinx Versal2 ISP linux kernel module"
DESCRIPTION = "Versal2 Image Signal Processor (ISP) out-of-tree kernel modules provider for aarch64 devices"
SECTION = "kernel/modules"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eb723b61539feef013de476e68b5c50a"

SRC_URI = "git://github.com/Xilinx/isp-modules.git;protocol=https;branch=${SRC_BRANCH}"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal-2ve-2vm = "versal-2ve-2vm"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
inherit module

EXTRA_OEMAKE += "O=${STAGING_KERNEL_BUILDDIR}"

RDEPENDS:${PN} += "isp-firmware"

INHIBIT_PACKAGE_STRIP = "1"
