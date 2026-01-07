SUMMARY = "VCK190 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VCK190 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01070000/external/fwapp/vck190-pl-bram-gpio-fw_2026.1_0106_1_01070000.tar.gz"

SRC_URI[sha256sum] = "d7f57c365d0ab3d4501aed4229472c24615d57c5b50bda5acc1905f17237c9e8"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vck190-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vck190/pl/${FW_DIR}"
