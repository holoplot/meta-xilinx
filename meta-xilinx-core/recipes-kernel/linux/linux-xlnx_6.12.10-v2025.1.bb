LINUX_VERSION = "6.12.10"
YOCTO_META ?= "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-6.12;destsuffix=yocto-kmeta"
KBRANCH="xlnx_rebase_v6.12_LTS"
SRCREV = "61098d783f90d679e347186684cfc2d0204c670c"
SRCREV_meta = "5d9c6c5b0531161f9e8e9d108740ebcec9177398"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
