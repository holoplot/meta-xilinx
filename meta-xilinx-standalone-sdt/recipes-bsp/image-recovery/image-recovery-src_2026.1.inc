IMG_RCVRY_REPO ??= "git://github.com/Xilinx/image-recovery.git;protocol=https"

IMG_RCVRY_BRANCH ??= "main"
IMG_RCVRY_BRANCHARG = "${@['nobranch=1', 'branch=${IMG_RCVRY_BRANCH}'][d.getVar('IMG_RCVRY_BRANCH') != '']}"

IMG_RCVRY_SRCREV ?= "89ae11105c20c3398a6ce9a3406bb95ed4d85ce3"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:k26-smk-kr-sdt = "${MACHINE}"
COMPATIBLE_MACHINE:k26-smk-kv-sdt = "${MACHINE}"
COMPATIBLE_MACHINE:k24-smk-kd-sdt = "${MACHINE}"
