SECTION	= "libs"

REPO ?= "git://github.com/Xilinx/aie-rt.git;protocol=https"

BRANCH ?= "main-aie"
SRCREV ?= "3268ad85a4e07e2b92d7c862427fbafe1dc476b4"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM ?= "file://license.txt;md5=04a153cae61a8a606fc79dff49c2c897"

SRC_URI = "${REPO};branch=${BRANCH}"
