SUMMARY = "ZCU104 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU104 full  PL VCU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0421_1_04220322/external/zcu104-pl-vcu-fw/zcu104-pl-vcu-fw_2025.1_0421_1.tar.gz"

SRC_URI[sha256sum] = "3e89b8cc003ae79aab07424aad1f4031d93c81d55454a138e8cd20fb7ef06982"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu104-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu104-pl-vcu-fw"
