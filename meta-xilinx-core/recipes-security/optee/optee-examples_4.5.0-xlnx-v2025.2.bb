require recipes-security/optee/optee-examples.inc

BRANCH ?= ""
REPO ?= "git://github.com/Xilinx/optee_examples.git;protocol=https"
BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"
SRC_URI = "${REPO};${BRANCHARG}"

COMPATIBLE_MACHINE:versal-2ve-2vm = ".*"

SRCREV = "238cdefa694021b39751b0ca2e8f5583be27729f"
