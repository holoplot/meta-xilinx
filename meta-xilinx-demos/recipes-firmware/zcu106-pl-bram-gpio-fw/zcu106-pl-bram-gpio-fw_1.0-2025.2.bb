SUMMARY = "ZCU106 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU106 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/sdt/2025.2/2025.2_0723_1_07240318/external/zcu106-pl-bram-gpio-fw/zcu106-pl-bram-gpio-fw_2025.2_0723_1_07240318.tar.gz"

SRC_URI[sha256sum] = "406b4a66d6469926e6bae36fb8905c3bc5b68df825c51edb2689acd62e9cf3c7"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu106-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu106-pl-bram-gpio-fw"

