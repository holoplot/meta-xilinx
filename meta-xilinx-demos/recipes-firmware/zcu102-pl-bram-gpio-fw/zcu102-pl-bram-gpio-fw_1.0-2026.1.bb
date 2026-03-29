SUMMARY = "ZCU102 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU102 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03290038/external/fwapp/zcu102-pl-bram-gpio-fw_2026.1_0328_1_03290038.tar.gz"

SRC_URI[sha256sum] = "b0db49199d7f60d4dad4af59a7083b3b2d48914703084438299b6137d3a1de04"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu102-sdt-full = "${MACHINE}"

# When do_unpack is executed it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu102-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu102/pl/${FW_DIR}"
