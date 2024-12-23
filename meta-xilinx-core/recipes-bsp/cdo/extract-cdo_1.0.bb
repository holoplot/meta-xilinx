DESCRIPTION = "Recipe to extract pmc_cdo for qemu usage"

LICENSE = "CLOSED"

inherit deploy

PROVIDES = "virtual/cdo"

DEPENDS += "bootgen-native"

do_compile[depends] += "virtual/boot-bin:do_deploy"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal = "versal"
COMPATIBLE_MACHINE:versal-net = "versal-net"
COMPATIBLE_MACHINE:versal2 = "versal2"

PACKAGE_ARCH ?= "${MACHINE_ARCH}"

B = "${WORKDIR}/build"

BOOTGEN_CMD ?= "bootgen"
BOOTGEN_ARCH_DEFAULT = "undefined"
BOOTGEN_ARCH_DEFAULT:versal = "versal"
BOOTGEN_ARCH_DEFAULT:versal-net = "versalnet"
BOOTGEN_ARCH ?= "${BOOTGEN_ARCH_DEFAULT}"
BOOTGEN_OUTFILE ?= "${DEPLOY_DIR_IMAGE}/boot.bin"

# bootgen extracts the pmc_cdo file from the boot.bin.  By default this
# happens in the same directory as the boot.bin.  We need to move it to
# this directory, as do_compile should never write into a deploy dir
do_compile() {
    ${BOOTGEN_CMD} -arch ${BOOTGEN_ARCH} -dump_dir ${B} -dump ${BOOTGEN_OUTFILE} pmc_cdo
}

do_install[noexec] = '1'

do_deploy() {
    install -d ${DEPLOYDIR}/CDO
    install -m 0644 ${B}/pmc_cdo.bin ${DEPLOYDIR}/CDO/pmc_cdo.bin
    ln -sf CDO/pmc_cdo.bin ${DEPLOYDIR}/pmc_cdo.bin
}

addtask deploy before do_build after do_install
