# Use this as a template for your machine's configuration
# the dtsi examples may need to be modified for your board

#FILESEXTRAPATHS:prepend:board:imgrcvry := "${THISDIR}/files:"
#FILESEXTRAPATHS:prepend:board:linux := "${THISDIR}/files:"

#IMGRCVRY_DT_FILE_INCLUDE:zynqmp ?= "imgrcvry-zynqmp-system-conf.dtsi"
#IMGRCVRY_DT_FILE_INCLUDE:versal ?= "imgrcvry-system-conf.dtsi"
#IMGRCVRY_DT_FILE_INCLUDE:versal2 ?= "imgrcvry-system-conf.dtsi"

# Examples:
# zynqmp:  imgrcvry-zynqmp-system-conf.dtsi
# versal:  imgrcvry-system-conf.dtsi
# versal2: imgrcvry-system-conf.dtsi
#
#EXTRA_DT_INCLUDE_FILES:append:board:imgrcvry = " imgrcvry-example.dtsi"
#EXTRA_DT_INCLUDE_FILES:append:board:linux = " imgrcvry-example.dtsi"
