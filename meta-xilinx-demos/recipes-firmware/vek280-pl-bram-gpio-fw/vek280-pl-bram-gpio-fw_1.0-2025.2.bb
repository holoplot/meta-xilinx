SUMMARY = "VEK280 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK280 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/sdt/2025.2/2025.2_0903_1_09040318/external/vek280-pl-bram-gpio-fw/vek280-pl-bram-gpio-fw_2025.2_0903_1_09040318.tar.gz"

SRC_URI[sha256sum] = "515e9afa0c699547921317311eb9c29ce414c767f75cc7df7527d3e1eefcf371"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek280-pl-bram-gpio-fw"
