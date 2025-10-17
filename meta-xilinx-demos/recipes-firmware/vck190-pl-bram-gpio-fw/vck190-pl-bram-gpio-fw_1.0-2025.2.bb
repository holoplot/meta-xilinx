SUMMARY = "VCK190 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VCK190 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10170000/external/fwapp/vck190-pl-bram-gpio-fw_2025.2_1016_1_10170000.tar.gz"

SRC_URI[sha256sum] = "5133df41b1e0ac56a63c74a5062a659d0e2e50440280afaf15760c6a7c84a1a6"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vck190-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vck190-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vck190/pl/${FW_DIR}"
