REPO ?= "gitsm://github.com/Xilinx/XRT.git;protocol=https"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = "${REPO};${BRANCHARG};name=xrt"

BRANCH = "2025.1"
SRCREV_xrt = "6d79c5f0e8c3f0ca8c08d35f2cfe6908ca0752a3"
