SUMMARY = "ZCU111 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU111 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/11290000/external/fwapp/zcu111-pl-bram-gpio-fw_2026.1_1128_1_11290000.tar.gz"

SRC_URI[sha256sum] = "9654b7479251441434dfca14ee0d0493c02d411eab8be86e55038bf251809732"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu111-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu111-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu111/pl/${FW_DIR}"
