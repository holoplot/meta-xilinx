SUMMARY = "VRK165 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VRK165 Segemented Configuration(DFx Full) PL AXI BRAM and AXI GPIO firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12170000/external/fwapp/vrk165-pl-bram-gpio-fw_2026.1_1216_1_12170000.tar.gz"

SRC_URI[sha256sum] = "d43fb88efc2515d195fa41fe62b670bb192a867c7a125f3ae5aeb3b14e242fea"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vrk165-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vrk165-pl-bram-gpio-fw"
FW_INSTALL_DIR = "vrk165/pl/${FW_DIR}"
