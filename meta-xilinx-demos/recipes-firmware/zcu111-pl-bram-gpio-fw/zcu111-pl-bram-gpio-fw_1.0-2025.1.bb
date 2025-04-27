SUMMARY = "ZCU111 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU111 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0426_1_04271304/external/zcu111-pl-bram-gpio-fw/zcu111-pl-bram-gpio-fw_2025.1_0426_1.tar.gz"

SRC_URI[sha256sum] = "dfc53cb9ee94ca139a7381db59d2d525b963b05d749f856792ba07c7404a1732"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu111-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu111-pl-bram-gpio-fw"
