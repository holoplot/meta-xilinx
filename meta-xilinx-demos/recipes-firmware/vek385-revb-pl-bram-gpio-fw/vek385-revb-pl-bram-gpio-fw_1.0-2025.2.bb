SUMMARY = "VEK385-revB Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK385-revB Segemented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10310000/external/fwapp/vek385-revb-pl-bram-gpio-fw_2025.2_1030_1_10310000.tar.gz"

SRC_URI[sha256sum] = "4fb85144c8b495afb128e572042daa0064ffba0675b5b7abef512f34354262b8"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa78-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-2ve-2vm-vek385-revb-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek385-revb-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vek385-revb/pl/${FW_DIR}"
