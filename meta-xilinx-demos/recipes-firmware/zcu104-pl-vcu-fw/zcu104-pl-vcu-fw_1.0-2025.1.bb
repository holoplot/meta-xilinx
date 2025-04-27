SUMMARY = "ZCU104 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU104 full  PL VCU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0426_1_04270633/external/zcu104-pl-vcu-fw/zcu104-pl-vcu-fw_2025.1_0426_1.tar.gz"

SRC_URI[sha256sum] = "06d4bf36b5a3f967adfe6e76514b2ff49a23f5cab5fd31dc3efb790923e0bd5e"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu104-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu104-pl-vcu-fw"
