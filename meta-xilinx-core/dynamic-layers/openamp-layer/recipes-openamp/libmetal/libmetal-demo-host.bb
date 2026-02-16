require ${LAYER_PATH_openamp-layer}/recipes-openamp/rpmsg-examples/rpmsg-example.inc
SRCREV = "a591224d413fb3d7d028e6ce3af1b2bf875d7dee"

S = "${WORKDIR}/git/examples/libmetal"
inherit pkgconfig cmake

SYSTEM_DTFILE_DEPENDS ??= ""
LIBMETAL_DEPENDS ?= "${SYSTEM_DTFILE_DEPENDS}"
LIBMETAL_DTFILE ?= "${CONFIG_DTFILE}"
DEPENDS:append = "${LIBMETAL_DEPENDS}"
DEPENDS:append = " libmetal "

FILES:${PN} = " /usr/bin/irq_shmem_demo "

do_install () {
	install -d ${D}/usr/bin
	install -m 0755 ${B}/machine/host/amd_linux_userspace/irq_shmem_demo ${D}/usr/bin/irq_shmem_demo
}

EXTRA_OECMAKE:append = " \ 
        -DLIB_INSTALL_DIR=${libdir} \
        -DLIBEXEC_INSTALL_DIR=${libexecdir} \
	"
DEMO_CFG_FILE ?= "config_example.cmake"

cmake_do_generate_toolchain_file:append() {
  cat >> ${WORKDIR}/toolchain.cmake <<EOF
    set (DEMO irq_shmem_demo)
    set (ROLE host)
    set (PROJECT_MACHINE amd_linux_userspace)
    set_property(GLOBAL PROPERTY DEMO_CFG_FILE "${S}/${DEMO_CFG_FILE}")
EOF
}

do_configure[depends] += " lopper-native:do_install lopper-native:do_populate_sysroot dtc-native:do_populate_sysroot "
ESW_MACHINE:linux:versal-2ve-2vm ?= "cortexa78_0"
ESW_MACHINE:linux:versal-net ?= "psx_cortexa78_0"
ESW_MACHINE:linux:versal ?= "psv_cortexa72_0"
ESW_MACHINE:linux:zynqmp ?= "psu_cortexa53_0"

do_configure:prepend() {
    export LOPPER_DTC_FLAGS="-b 0 -@" 
    cd ${S}
    lopper ${LIBMETAL_DTFILE} -- openamp \
      --libmetal_output_file --compatible-string=libmetal,ipc-v1 \
      --processor=${ESW_MACHINE}  --os=linux_dt \
      --openamp_output_filename=${DEMO_CFG_FILE}

    if [ -n "${S}/config_example.cmake" ]; then
        if [ ! -e "${S}/config_example.cmake" ]; then
            bberror "${S}/config_example.cmake is not present, we can't continue"
            exit 1
        fi  
    fi  
    cd -
}

RDEPENDS:${PN}:append:aarch64:linux = " libudev"
