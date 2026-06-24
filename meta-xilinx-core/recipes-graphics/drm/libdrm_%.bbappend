FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Xilinx modetest / DRM-format (XV15/XV20, VCU2-tiled, YUV) enhancements.
# These only matter on Xilinx SOCs, so do not apply them on non-Xilinx
# machines (e.g. intel-corei7-64), where they are irrelevant and would also
# fail to apply against oe-core's libdrm.
# NOTE: these were authored against an older libdrm and are currently stale
# vs wrynose's libdrm 2.4.131 - they will need rebasing before they apply on
# the Xilinx targets that actually use them.
XILINX_LIBDRM_PATCHES = " \
	file://0001-libdrm-Update-drm-header-file-with-XV15-and-XV20.patch \
	file://0002-modetest-Add-semiplanar-10bit-pattern-support-for-mo.patch \
	file://0003-modetest-fix-smpte-colour-pattern-issue-for-XV20-and.patch \
	file://0004-modetest-Add-YUV444-and-X403-format-support-for-mode.patch \
	file://0005-Update-libdrm-drm_fourcc.h-to-add-VCU2-tiled-formats.patch \
	file://0006-libdrm-Add-support-for-some-YUV-DRM-formats.patch \
	file://0007-modetest-Add-pattern-support-for-xilinx-tiled-format.patch \
"

SRC_URI:append:zynq       = " ${XILINX_LIBDRM_PATCHES}"
SRC_URI:append:zynqmp     = " ${XILINX_LIBDRM_PATCHES}"
SRC_URI:append:versal     = " ${XILINX_LIBDRM_PATCHES}"
SRC_URI:append:versal-net = " ${XILINX_LIBDRM_PATCHES}"
SRC_URI:append:microblaze = " ${XILINX_LIBDRM_PATCHES}"
