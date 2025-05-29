SUMMARY = "VEK280 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK280 Segemented Configuration(DFx Full) PL AIE and VDU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts


SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/sdt/2025.2/2025.2_0528_1_05290318/external/vek280-pl-aie-vdu-fw/vek280-pl-aie-vdu-fw_2025.1_0522_1.tar.gz"

SRC_URI[sha256sum] = "bfa64d4ac2165499ecea6a1daaf2bd7b42db3b21691e26a85f9b28b9a471c928"

COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek280-pl-aie-vdu-fw"
