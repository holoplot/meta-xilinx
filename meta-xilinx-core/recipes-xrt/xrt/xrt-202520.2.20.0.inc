REPO ?= "gitsm://github.com/Xilinx/XRT.git;protocol=https"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = "${REPO};${BRANCHARG};name=xrt"

BRANCH = "2025.2"
SRCREV_xrt = "bcc672e1224dc1ec5b430b726a2b0241bd600e9f"
