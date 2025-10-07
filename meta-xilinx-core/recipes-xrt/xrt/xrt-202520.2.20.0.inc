REPO ?= "gitsm://github.com/Xilinx/XRT.git;protocol=https"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = "${REPO};${BRANCHARG};name=xrt"

BRANCH = "master"
SRCREV_xrt = "f29ce74f0cf7c9655ec0d9012a050a7ce9d85b17"
