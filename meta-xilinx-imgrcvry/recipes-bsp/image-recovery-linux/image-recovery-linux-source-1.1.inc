REPO ??= "git://github.com/Xilinx/image-recovery-linux.git;protocol=https"

BRANCH ?= "main"

SRCREV ?= "801760d526a73902c0740a83fc1f208f679c6daf"

BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"

SRC_URI = "${REPO};${BRANCHARG}"
