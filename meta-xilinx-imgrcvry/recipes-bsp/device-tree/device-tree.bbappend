FILESEXTRAPATHS:prepend:imgrcvry := "${THISDIR}/files:"

IMGRCVRY_DT_FILE_INCLUDE ?= ""
IMGRCVRY_DT_FILE_INCLUDE:zynqmp ?= "imgrcvry-zynqmp-system-conf.dtsi"
IMGRCVRY_DT_FILE_INCLUDE:versal ?= "imgrcvry-system-conf.dtsi"
IMGRCVRY_DT_FILE_INCLUDE:versal2 ?= "imgrcvry-system-conf.dtsi"

EXTRA_DT_INCLUDE_FILES:append:imgrcvry = " ${IMGRCVRY_DT_FILE_INCLUDE}"
