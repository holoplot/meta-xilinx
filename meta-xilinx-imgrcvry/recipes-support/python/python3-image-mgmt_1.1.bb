SUMMARY = "AMD System Boot Image Management Tool"
DESCRIPTION = "Python-based tool for system boot image management, storage detection, \
USB scanning, and UFS configuration on AMD platforms."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

require recipes-bsp/image-recovery-linux/image-recovery-linux-source-${PV}.inc

inherit setuptools3

S = "${WORKDIR}/git"

# Python dependencies
RDEPENDS:${PN} = " \
    python3-core \
"

# Host utilities called from Python scripts
RDEPENDS:${PN} += " \
    binutils \
    mtd-utils \
    freeipmi \
    ufs-utils \
"
