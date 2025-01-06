require ${LAYER_PATH_openamp-layer}/recipes-openamp/rpmsg-examples/rpmsg-example.inc
require ${LAYER_PATH_openamp-layer}/vendor/xilinx/meta-xilinx-standalone-sdt/recipes-openamp/open-amp/open-amp-xlnx-demos.inc

OPENAMP_SYS_REF_SRCREV = "80e64e61cf0d68f005433ceb027468cf64884ef6"
OPENAMP_SYS_REF_BRANCH = "main"
LIC_FILES_CHKSUM ?= "file://LICENSE.md;md5=ab88daf995c0bd0071c2e1e55f3d3505"
PV .= "+git"
BRANCH = "main"
REPO = "git://github.com/Xilinx/openamp-system-reference.git;protocol=https"

OPENAMP_APP_NAME = "rpc_demo"

RPROVIDES:${PN}-dbg += "open-amp-xlnx-proxy-dbg"
RPROVIDES:${PN}-dev += "open-amp-xlnx-proxy-dev"
RPROVIDES:${PN}-lic += "open-amp-xlnx-proxy-lic"
RPROVIDES:${PN}-src += "open-amp-xlnx-proxy-src"
RPROVIDES:${PN}-staticdev += "open-amp-xlnx-proxy-staticdev"
PROVIDES:${PN} += " open-amp-xlnx-proxy "
