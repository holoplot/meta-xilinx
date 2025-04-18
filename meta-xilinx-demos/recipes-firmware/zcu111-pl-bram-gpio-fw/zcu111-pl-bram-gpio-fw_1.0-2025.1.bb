SUMMARY = "ZCU111 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU111 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0421_1_04220322/external/zcu111-pl-bram-gpio-fw/zcu111-pl-bram-gpio-fw_2025.1_0421_1.tar.gz"

SRC_URI[sha256sum] = "7e8eb4c1d241899758de7c0d2ea47a652d23884cb3261d31d0ca0a19a7168aec"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu111-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu111-pl-bram-gpio-fw"
