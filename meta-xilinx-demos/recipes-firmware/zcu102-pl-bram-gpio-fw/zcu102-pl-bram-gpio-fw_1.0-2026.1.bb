SUMMARY = "ZCU102 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU102 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/11290000/external/fwapp/zcu102-pl-bram-gpio-fw_2026.1_1128_1_11290000.tar.gz"

SRC_URI[sha256sum] = "643dcb97929ff6ab37b6b5317f5a07fe388202a58a16f9046f61c4b48f5b70b2"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu102-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu102-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu102/pl/${FW_DIR}"
