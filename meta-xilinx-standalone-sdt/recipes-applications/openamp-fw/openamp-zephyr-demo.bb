require openamp-fw.inc
MCNAME = "zephyr"
FW_MC_MACHINE ?= ""
FW_MC_MACHINE:versal-2ve-2vm-vek385-sdt-seg = "versal-2ve-2vm-vek385-sdt-seg-cortexr52-0-zephyr"
FW_MC_MACHINE:versal-2ve-2vm-vek385-revb-sdt-seg = "versal-2ve-2vm-vek385-revb-sdt-seg-cortexr52-0-zephyr"
FW_MC_MACHINE:versal-vn-p-b2197-00-reva-x-prc-09-reva-sdt-full = "versal-vn-p-b2197-00-reva-x-prc-09-reva-sdt-full-cortexr52-0-zephyr"
FW_MC_MACHINE:versal-vn-p-b2197-00-reva-x-prc-09-reva-sdt-full = "versal-vn-p-b2197-00-reva-x-prc-09-reva-sdt-full-cortexr52-0-zephyr"
FW_MC_MACHINE:versal-vn-p-b2197-00-reva-x-prc-07-reva-sdt-full = "versal-vn-p-b2197-00-reva-x-prc-07-reva-sdt-full-cortexr52-0-zephyr"

FW_MCDEPENDS = "mc::${FW_MC_MACHINE}:zephyr-openamp-rpmsg-multi-srv:do_deploy"

TARGET_MC = "cortexr52-0-zephyr"
OPENAMP_FW_NAME = "zephyr-openamp-rpmsg-multi-srv.elf"
OPENAMP_FW_SRC_NAME = "${OPENAMP_FW_NAME}"
OPENAMP_XLNX_RECIPE = "${OPENAMP_FW_NAME}"

PROVIDES:append:armv7r = " openamp-zephyr-demo "
PROVIDES:append:armv8r = " openamp-zephyr-demo "

RPROVIDES:${PN} += "openamp-zephyr-demo"
DEPENDS = ""
