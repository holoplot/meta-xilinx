DESCRIPTION = "libraries for Versal with Mali G78AE"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA;md5=646a0c3fd8ffd4c63169926fbc5f62a8"

inherit features_check update-alternatives

REQUIRED_DISTRO_FEATURES = "wayland"
REQUIRED_MACHINE_FEATURES = "malig78ae"

REPO ?= "git://github.com/Xilinx/g78ae-userspace-binaries.git;protocol=https"
BRANCH ?= "r51p0-00eac0-1.rel01"
SRCREV ?= "9323acee1129b6f21c94db142d2a697e681d7583"

SRC_URI = "${REPO};branch=${BRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

DEPENDS += "libdrm wayland"

RDEPENDS:${PN} = " kernel-modules-g78ae"

do_compile[noexec] = "1"

do_install() {
    install_include_dir="${D}${includedir}"
    install_lib_dir="${D}${libdir}"
    install_pkgconfig_dir="${D}${libdir}/pkgconfig"
    install_vulkan_icd_dir="${D}/${datadir}/vulkan/icd.d"

    # libraries
    install -d ${install_lib_dir}
    cp -r ${S}/lib/* ${install_lib_dir}/.

    # headers
    install -d -m 0655 ${install_include_dir}/EGL
    install -m 0644 ${S}/include/EGL/*.h ${install_include_dir}/EGL/
    install -d -m 0655 ${install_include_dir}/GLES
    install -m 0644 ${S}/include/GLES/*.h ${install_include_dir}/GLES/
    install -d -m 0655 ${install_include_dir}/GLES2
    install -m 0644 ${S}/include/GLES2/*.h ${install_include_dir}/GLES2/
    install -d -m 0655 ${install_include_dir}/GLES3
    install -m 0644 ${S}/include/GLES3/*.h ${install_include_dir}/GLES3/
    install -d -m 0655 ${install_include_dir}/KHR
    install -m 0644 ${S}/include/KHR/*.h ${install_include_dir}/KHR/
    install -d -m 0655 ${install_include_dir}
    install -m 0644 ${S}/include/gbm.h ${install_include_dir}/

    # pkconfig
    install -d ${install_pkgconfig_dir}
    install -m 0644 ${S}/pkgconfig/egl.pc ${install_pkgconfig_dir}/egl.pc
    install -m 0644 ${S}/pkgconfig/glesv1_cm.pc ${install_pkgconfig_dir}/glesv1_cm.pc
    install -m 0644 ${S}/pkgconfig/glesv2.pc ${install_pkgconfig_dir}/glesv2.pc
    install -m 0644 ${S}/pkgconfig/gbm.pc ${install_pkgconfig_dir}/gbm.pc

    # vulkan icd
    install -d ${install_vulkan_icd_dir}
    install -m 0644 ${S}/vulkan/mali_icd.json ${install_vulkan_icd_dir}/mali_icd.json
}

# Package gets renamed on the debian class, but we want to keep -xlnx
DEBIAN_NOAUTONAME:libmali-xlnx = "1"

# Inhibit warnings about files being stripped
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

# These libraries shouldn't get installed in world builds unless something
# explicitly depends upon them.
EXCLUDE_FROM_WORLD = "1"
FILES:${PN}-dev += " \
	${libdir}/libEGL.so \
	${libdir}/libgbm.so \
	${libdir}/libGLESv1_CM.so \
	${libdir}/libGLESv2.so \
	${libdir}/libmali.so \
	${libdir}/libOpenCL.so \
	"

FILES:${PN} += " \
	${libdir}/libEGL.so.1 \
	${libdir}/libEGL.so.1.4.0 \
	${libdir}/libgbm.so.1 \
	${libdir}/libgbm.so.1.0.0 \
	${libdir}/libGLESv1_CM.so.1 \
	${libdir}/libGLESv1_CM.so.1.1.0 \
	${libdir}/libGLESv2.so.2 \
	${libdir}/libGLESv2.so.2.1.0 \
	${libdir}/libmali.so.0 \
	${libdir}/libmali.so.0.51.0 \
	${libdir}/libOpenCL.so.1 \
	${libdir}/libOpenCL.so.1.0.0 \
	${datadir} \
	"
