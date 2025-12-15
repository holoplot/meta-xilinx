DESCRIPTION = "Image Recovery"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

REPO ??= "git://github.com/Xilinx/image-recovery-linux.git;protocol=https"
BRANCH ??= "main"

BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"

SRC_URI = "${REPO};${BRANCHARG}"
SRCREV ??= "b9c709e96d8e36553096f250fee16c1a1ab6f793"

inherit autotools-brokensep
S = "${WORKDIR}/git"

COMPATIBLE_MACHINE ?= "^$"
COMPATIBLE_MACHINE:versal-2ve-2vm = ".*"
COMPATIBLE_MACHINE:versal = ".*"
COMPATIBLE_MACHINE:zynqmp = ".*"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

