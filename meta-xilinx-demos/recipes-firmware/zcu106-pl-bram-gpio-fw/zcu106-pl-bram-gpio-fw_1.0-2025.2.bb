SUMMARY = "ZCU106 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU106 full  PL BRAM AND GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10170000/external/fwapp/zcu106-pl-bram-gpio-fw_2025.2_1016_1_10170000.tar.gz"

SRC_URI[sha256sum] = "6177761e59790c6e980ec37eba50cbadee95fa9cdfce2a944b38cb414e9529ca"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu106-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu106-pl-bram-gpio-fw"
FW_INSTALL_DIR = "zcu106/pl/${FW_DIR}"
