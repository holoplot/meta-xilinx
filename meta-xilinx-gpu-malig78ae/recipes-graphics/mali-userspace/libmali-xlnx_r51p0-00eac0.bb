DESCRIPTION = "libraries for Versal with Mali G78AE"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA;md5=646a0c3fd8ffd4c63169926fbc5f62a8"

inherit features_check update-alternatives

REQUIRED_DISTRO_FEATURES = "wayland"
REQUIRED_MACHINE_FEATURES = "malig78ae"

REPO ?= "git://github.com/Xilinx/g78ae-userspace-binaries.git;protocol=https"
BRANCH ?= "r51p0-00eac0-1"
SRCREV ?= "b721040e9ced793d54b13169794a92f738a319a2"

SRC_URI = "${REPO};branch=${BRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

DEPENDS += "libdrm wayland"

RDEPENDS:${PN} = " kernel-modules-g78ae"

do_compile[noexec] = "1"

do_install() {

    # install libraries
    install -d ${D}${libdir}/mali

    # Link based on backend
    cp -r ${S}/lib/* ${D}${libdir}/mali/.
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
	${libdir}/mali/libEGL.so \
	${libdir}/mali/libgbm.so \
	${libdir}/mali/libGLESv1_CM.so \
	${libdir}/mali/libGLESv2.so \
	${libdir}/mali/libmali.so \
	${libdir}/mali/libOpenCL.so \
	"

FILES:${PN} += " \
	${libdir}/mali/libEGL.so.1 \
	${libdir}/mali/libEGL.so.1.4.0 \
	${libdir}/mali/libgbm.so.1 \
	${libdir}/mali/libgbm.so.1.0.0 \
	${libdir}/mali/libGLESv1_CM.so.1 \
	${libdir}/mali/libGLESv1_CM.so.1.1.0 \
	${libdir}/mali/libGLESv2.so.2 \
	${libdir}/mali/libGLESv2.so.2.1.0 \
	${libdir}/mali/libmali.so.0 \
	${libdir}/mali/libmali.so.0.51.0 \
	${libdir}/mali/libOpenCL.so.1 \
	${libdir}/mali/libOpenCL.so.1.0.0 \
	"
