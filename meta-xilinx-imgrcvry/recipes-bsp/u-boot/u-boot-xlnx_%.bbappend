FILESEXTRAPATHS:prepend:imgrcvry := "${THISDIR}/${PN}:"

PREBOOT_CFG_FILE ?= "file://preboot_cmd.cfg"
PREBOOT_CFG_FILE:versal2 ?= "file://preboot_cmd_versal2.cfg"
SRC_URI:append:imgrcvry = " ${PREBOOT_CFG_FILE}"
