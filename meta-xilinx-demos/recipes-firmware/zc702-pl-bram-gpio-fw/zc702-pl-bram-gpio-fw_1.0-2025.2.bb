SUMMARY = "ZC702 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZC702 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10112136/external/fwapp/zc702-pl-bram-gpio-fw_2025.2_1011_1_10112136.tar.gz"

SRC_URI[sha256sum] = "058d2ae6f8f8e007b361767a1d809dd40bd84ddcbc8e47d8eac282c40632e62c"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa9thf-neon-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynq-zc702-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zc702-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zc702/pl/${FW_DIR}"
