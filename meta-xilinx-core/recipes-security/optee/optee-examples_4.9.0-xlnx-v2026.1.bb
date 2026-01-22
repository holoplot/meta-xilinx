require recipes-security/optee/optee-examples.inc
BRANCH ?= "xlnx_rebase_v4.9.0"
REPO ?= "git://github.com/Xilinx/optee_examples.git;protocol=https"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = "${REPO};${BRANCHARG}"

COMPATIBLE_MACHINE:versal-2ve-2vm = ".*"

SRCREV = "934c7edb74a26e90f68024cf441073528444177f"
