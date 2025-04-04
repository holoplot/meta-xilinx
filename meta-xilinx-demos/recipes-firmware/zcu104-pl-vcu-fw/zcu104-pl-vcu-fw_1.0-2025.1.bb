SUMMARY = "ZCU104 full pl firmware using dfx_user_dts bbclass"
DESCRIPTION = "ZCU104 full  PL VCU firmware application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.1/sdt/2025.1/2025.1_0404_1_04040829/external/zcu104-pl-vcu-fw/zcu104-pl-vcu-fw_2025.1_0404_1.tar.gz"

SRC_URI[sha256sum] = "20ba5e53fa578d9db8cd0fe031b56b03fdaf7f744e15eba60e9b4134ad9c3120"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-mali-common = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-zcu104-sdt-full = "${MACHINE}"

# When do_upack is exectuted it will extract tar file with original directory
# name so set the FW_DIR pointing to pdi and dtsi files.
FW_DIR = "zcu104-pl-vcu-fw"

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
