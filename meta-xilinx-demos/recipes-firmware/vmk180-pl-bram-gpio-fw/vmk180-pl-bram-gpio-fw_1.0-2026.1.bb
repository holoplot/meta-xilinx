SUMMARY = "VMK180 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VMK180 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12150000/external/fwapp/vmk180-pl-bram-gpio-fw_2026.1_1214_1_12150000.tar.gz"

SRC_URI[sha256sum] = "b08109f39f937dff71d2dd2787ce0125e2a6d3e65e448dec6cc669c0c1ab9039"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vmk180-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vmk180-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vmk180/pl/${FW_DIR}"
