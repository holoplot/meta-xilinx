REPO ?= "gitsm://github.com/Xilinx/XRT.git;protocol=https"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = "${REPO};${BRANCHARG};name=xrt"

BRANCH = "master"
SRCREV_xrt = "ce90df4adbd0dd538898c7e4d67c8e491ceebed1"
