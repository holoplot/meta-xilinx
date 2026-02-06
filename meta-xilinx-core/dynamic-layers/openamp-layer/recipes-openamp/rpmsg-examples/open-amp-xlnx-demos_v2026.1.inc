require ${LAYER_PATH_openamp-layer}/recipes-openamp/rpmsg-examples/rpmsg-example.inc
require open-amp-xlnx-demos.inc

SRCREV = "f71199f8ff873d5ba9f3af18fef28c2807dc88d5"
BRANCH = "2026"
LIC_FILES_CHKSUM ?= "file://LICENSE.md;md5=ab88daf995c0bd0071c2e1e55f3d3505"
PV .= "+git"
REPO = "git://github.com/Xilinx/openamp-system-reference.git;protocol=https"

