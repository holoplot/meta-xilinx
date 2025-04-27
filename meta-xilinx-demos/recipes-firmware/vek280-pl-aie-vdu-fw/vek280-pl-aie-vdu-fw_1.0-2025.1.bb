SUMMARY = "VEK280 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK280 Segemented Configuration(DFx Full) PL AIE and VDU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts


SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0426_1_04271304/external/vek280-pl-aie-vdu-fw/vek280-pl-aie-vdu-fw_2025.1_0422_1.tar.gz"

SRC_URI[sha256sum] = "7750c4a1c0dab368a847ca54734390812cb6c68bd975fe095c3f3a6d910be55a"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek280-pl-aie-vdu-fw"
