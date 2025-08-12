SUMMARY = "ZC702 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZC702 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/sdt/2025.2/2025.2_0811_1_08120318/external/zc702-pl-bram-gpio-fw/zc702-pl-bram-gpio-fw_2025.2_0811_1_08120318.tar.gz"

SRC_URI[sha256sum] = "4444813edb82c6b38ee3756e74b198898c3ece8606d29a23133ff592e2e2f827"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa9thf-neon-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynq-zc702-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zc702-pl-bram-gpio-fw"
