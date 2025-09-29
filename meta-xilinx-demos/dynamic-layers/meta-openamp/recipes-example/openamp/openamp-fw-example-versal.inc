# all recipes using this *inc need to define the following variables
# the following variables have the specified defaults
# (some of which can be overridden)
#    OPENAMPFW_CORE: the core on which the demo is to run
#        default: "r5"
#    OPENAMPFW_SLOT: the core slot on which the demo is to run
#        default: "0"
#    OPENAMPFW_OS: the OS on which the demo runs
#        default: "freertos" for versal gen1
#                 "zephyr" for versal gen2
#    OPENAMPFW_DEMOS: the name of the demos demo
#        default: "rpmsg-echo matrix-multiply rpc-demo" for versal gen1
#                 "rpmsg_service" for versal gen2

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal = "${MACHINE}"
COMPATIBLE_MACHINE:versal-2ve-2vm = "${MACHINE}"

do_compile[noexec] = "1"

OPENAMPFW_BASEDIR = "${nonarch_base_libdir}/firmware/xilinx/rpu"
OPENAMPFW_BOARD = "${@d.getVar("BPN").split("-")[0]}"
OPENAMPFW_CORE ?= "r5"
OPENAMPFW_SLOT ?= "0"
OPENAMPFW_OS ?= ""
OPENAMPFW_OS:versal ?= "freertos"
OPENAMPFW_OS:versal-2ve-2vm ?= "zephyr"
OPENAMPFW_DEMOS ?= ""
OPENAMPFW_DEMOS:versal ?= "rpmsg-echo matrix-multiply rpc-demo"
OPENAMPFW_DEMOS:versal-2ve-2vm ?= "rpmsg_multi_services"
OPENAMPFW_PKGDIR ?= ""
OPENAMPFW_PKGDIR:versal ?= "versal-${OPENAMPFW_BOARD}-sdt-seg_packagegroup-openamp-fw-examples"
OPENAMPFW_PKGDIR:versal-2ve-2vm ?= "versal-2ve-2vm-${OPENAMPFW_BOARD}-sdt-seg_openamp-zephyr-demo"

S = "${WORKDIR}/files"
S:versal = "${WORKDIR}/${OPENAMPFW_PKGDIR}"
S:versal-2ve-2vm = "${WORKDIR}/${OPENAMPFW_PKGDIR}"

do_install() {
    if [ -z "${OPENAMPFW_CORE}" ]; then
        bberror "OPENAMPFW_CORE is not set"
        exit 1
    fi
    if [ -z "${OPENAMPFW_SLOT}" ]; then
        bberror "OPENAMPFW_SLOT is not set"
        exit 1
    fi
    if [ -z "${OPENAMPFW_OS}" ]; then
        bberror "OPENAMPFW_OS is not set"
        exit 1
    fi
    if [ -z "${OPENAMPFW_DEMOS}" ]; then
        bberror "OPENAMPFW_DEMOS is not set"
        exit 1
    fi
    if [ -z "${OPENAMPFW_PKGDIR}" ]; then
        bberror "OPENAMPFW_PKGDIR is not set"
        exit 1
    fi

    install -d ${D}${OPENAMPFW_BASEDIR}
    for DEMO in ${OPENAMPFW_DEMOS}; do
        FULL_NAME=${OPENAMPFW_BOARD}-${OPENAMPFW_CORE}-${OPENAMPFW_SLOT}-${DEMO}-${OPENAMPFW_OS}

        install -d ${D}${OPENAMPFW_BASEDIR}/${FULL_NAME}/${FULL_NAME}_slot${OPENAMPFW_SLOT}
        install -Dm 0644 ${S}/${OPENAMPFW_BOARD}-${OPENAMPFW_CORE}-${OPENAMPFW_SLOT}-${DEMO}.elf ${D}${OPENAMPFW_BASEDIR}/${FULL_NAME}/${FULL_NAME}_slot${OPENAMPFW_SLOT}/${FULL_NAME}.elf
   done
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
INSANE_SKIP:${PN} += "arch usrmerge"

FILES:${PN} += "${OPENAMPFW_BASEDIR}"
