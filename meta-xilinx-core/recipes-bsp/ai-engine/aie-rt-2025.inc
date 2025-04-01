SECTION	= "libs"

REPO ?= "git://github.com/Xilinx/aie-rt.git;protocol=https"

BRANCH ?= "main-aie"
SRCREV ?= "e7d781e666c430d046cca848744c52a6856b87a0"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM ?= "file://license.txt;md5=04a153cae61a8a606fc79dff49c2c897"

SRC_URI = "${REPO};branch=${BRANCH}"
