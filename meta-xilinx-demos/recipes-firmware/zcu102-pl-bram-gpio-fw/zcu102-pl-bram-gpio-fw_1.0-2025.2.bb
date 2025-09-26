SUMMARY = "ZCU102 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU102 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09260420/external/fwapp/zcu102-pl-bram-gpio-fw_2025.2_0925_1_09260420.tar.gz"

SRC_URI[sha256sum] = "29512f27ee1b2a57ab07aecca9ff0da9622b49406dce4ab7dc0c4c2cb8067cd8"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu102-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu102-pl-bram-gpio-fw"

