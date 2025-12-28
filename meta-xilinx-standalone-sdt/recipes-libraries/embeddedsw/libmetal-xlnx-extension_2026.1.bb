inherit esw python3native

ESW_COMPONENT_SRC = "/ThirdParty/sw_services/libmetal_xlnx_extension/src/"
ESW_COMPONENT_NAME = "libmetal_xlnx_extension.a"

DEPENDS += "libxil ipipsu xiltimer libmetal-xlnx"
DEPENDS:append:xilinx-freertos = "freertos10-xilinx"

do_install() {
    install -d ${D}${libdir}
    install -m 0755  ${B}/lib/${ESW_COMPONENT_NAME} ${D}${libdir}
}

EXTRA_OECMAKE += "-DMACHINE=zynqmp_r5"
