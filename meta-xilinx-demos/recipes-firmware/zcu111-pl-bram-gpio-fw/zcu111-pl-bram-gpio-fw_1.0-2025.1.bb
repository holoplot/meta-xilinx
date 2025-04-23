SUMMARY = "ZCU111 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU111 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0422_1_04230439/external/zcu111-pl-bram-gpio-fw/zcu111-pl-bram-gpio-fw_2025.1_0422_1.tar.gz"

SRC_URI[sha256sum] = "17f1f400ee16953d651c77fc1dcef644ae9f3d4aca2072a07144675eec9a7ffe"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu111-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu111-pl-bram-gpio-fw"
