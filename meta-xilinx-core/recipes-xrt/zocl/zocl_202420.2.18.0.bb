SUMMARY  = "Xilinx Runtime(XRT) driver module"
DESCRIPTION = "Xilinx Runtime driver module provides memory management and compute unit schedule"

COMPATIBLE_MACHINE:microblaze = "none"

PROVIDES += "zocl"

require recipes-xrt/xrt/xrt-${PV}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=7d040f51aae6ac6208de74e88a3795f8"
LICENSE = "GPL-2.0-or-later & Apache-2.0"

COMPATIBLE_MACHINE ?= "^$"
COMPATIBLE_MACHINE:zynqmp = ".*"
COMPATIBLE_MACHINE:versal = ".*"
COMPATIBLE_MACHINE:versal-net = ".*"

S = "${WORKDIR}/git/src/runtime_src/core/edge/drm/zocl"

inherit module

pkg_postinst_ontarget:${PN}() {
  #!/bin/sh
  echo "Unloading old XRT Linux kernel modules"
  ( rmmod zocl || true ) > /dev/null 2>&1
  echo "Loading new XRT Linux kernel modules"
  modprobe zocl
}

SKIP_RECIPE[zocl] = "${@'Only kernel 6.6 and before are supported.' if bb.utils.vercmp_string(d.getVarFlag('XILINX_LINUX_VERSION', d.getVar('XILINX_RELEASE_VERSION')) or 'undefined', "6.7") >= 0 else ''}"
