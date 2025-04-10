SUMMARY = "VEK280 Segemented Configuration(DFx Full) firmware using dfx_user_dts bbclass"
DESCRIPTION = "VEK280 Segemented Configuration(DFx Full) PL AXI BRAM, AXI GPIO and AXI UART firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0409_1_04100141/external/vek280-pl-bram-gpio-fw/vek280-pl-bram-gpio-fw_2025.1_0409_1.tar.gz"

SRC_URI[sha256sum] = "b5302d2757ec79d5d92d0e2f5256013196d5817f522493596b3bc30cd79277a6"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal-common = "${MACHINE}"
COMPATIBLE_MACHINE:versal-vek280-sdt-seg = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "vek280-pl-bram-gpio-fw"

# fw files doesn't install on rootfs using dfx_user_dts bbclass using artifactory
# method. To workaround this issue we are using copy_fw_files pre-functions.
# copy_fw_files prefuncs needs to be called before find_firmware_file to update
# the firmware-name to ${PN}.
do_configure[prefuncs] =+ "copy_fw_files"
python copy_fw_files () {
    import shutil
    fw_file_src = d.getVar('WORKDIR') + '/' + d.getVar("FW_DIR")
    fw_file_dest = d.getVar('S')
    shutil.copytree(fw_file_src, fw_file_dest, dirs_exist_ok=True)
}
