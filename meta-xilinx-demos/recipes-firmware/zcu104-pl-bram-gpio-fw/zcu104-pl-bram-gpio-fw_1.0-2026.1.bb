SUMMARY = "ZCU104 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU104 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01010000/external/fwapp/zcu104-pl-bram-gpio-fw_2026.1_1231_1_01010000.tar.gz"

SRC_URI[sha256sum] = "c0a5c38731f3ffdceed4ccb9e44f3a577b73947b1b8efb8a103a347cfcbca35a"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu104-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu104-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu104/pl/${FW_DIR}"
