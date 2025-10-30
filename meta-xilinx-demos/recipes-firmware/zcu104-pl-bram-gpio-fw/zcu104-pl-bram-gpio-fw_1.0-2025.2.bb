SUMMARY = "ZCU104 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU104 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10300026/external/fwapp/zcu104-pl-bram-gpio-fw_2025.2_1029_1_10300026.tar.gz"

SRC_URI[sha256sum] = "1d8cde8a2f9a950b2fc98947119a36b16d8ea24082821c754ee213600400c496"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu104-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu104-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu104/pl/${FW_DIR}"
