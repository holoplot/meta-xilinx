SUMMARY = "Sample recipe to package and deploy baremetal or freertos elf or bin to linux rootfs"
LICENSE = "CLOSED"

inherit fw-package

OPENAMP_XLNX_RECIPE ?= "open-amp-xlnx-echo"

FW_OS ?= "freertos"

TARGET_MC:zynqmp = "cortexr5-0-${FW_OS}"
TARGET_MC:versal = "cortexr5-0-${FW_OS}"
TARGET_MC:versal-net = "cortexr52-0-${FW_OS}"
FW_MCDEPENDS = "mc::${MACHINE}-${TARGET_MC}:${OPENAMP_XLNX_RECIPE}:do_deploy"
FW_DEPLOY_DIR ?= "${TMPDIR}-${MACHINE}-${TARGET_MC}/deploy/images/${MACHINE}"

DESTDIR = "${nonarch_base_libdir}/firmware"

OPENAMP_FW_SRC_NAME ?= "rpmsg-echo.out"
OPENAMP_FW_NAME ?= "image_echo_test"
FW_NAME ?= "${OPENAMP_FW_SRC_NAME}"
FW_FILE ?= "${FW_DEPLOY_DIR}/${OPENAMP_FW_SRC_NAME}"
FW_IMAGE_NAME ?= "${OPENAMP_FW_NAME}"

DEPENDS = " open-amp-xlnx "

do_install() {
    if [ ! -e ${FW_DEPLOY_DIR}/${OPENAMP_FW_SRC_NAME} ]; then
        echo "Unable to find FW_FILE (${OPENAMP_FW_SRC_NAME})"
        exit 1
    fi

    install -Dm 0644 ${FW_DEPLOY_DIR}/${OPENAMP_FW_SRC_NAME} ${D}${DESTDIR}/${FW_IMAGE_NAME}
}

# If the item is already in OUR deploy_image_dir, nothing to deploy!
SHOULD_DEPLOY = "${@'false' if (d.getVar('FW_FILE')).startswith(d.getVar('DEPLOY_DIR_IMAGE')) else 'true'}"
do_deploy() {
    # If the item is already in OUR deploy_image_dir, nothing to deploy!
    if ${SHOULD_DEPLOY}; then
        install -Dm 0644 ${FW_FILE} ${DEPLOYDIR}/${FW_IMAGE_NAME}
    fi
}
