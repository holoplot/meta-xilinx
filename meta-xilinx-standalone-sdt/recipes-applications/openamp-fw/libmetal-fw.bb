require openamp-fw.inc

FW_MCDEPENDS = "mc::${MACHINE}-${TARGET_MC}:libmetal-xlnx:do_deploy"
DEPENDS = " libmetal-xlnx "

OPENAMP_FW_SRC_NAME = "metal.elf"
OPENAMP_FW_NAME = "metal.elf"

PROVIDES:append:armv7r = " libmetal-fw "
PROVIDES:append:armv8r = " libmetal-fw "
