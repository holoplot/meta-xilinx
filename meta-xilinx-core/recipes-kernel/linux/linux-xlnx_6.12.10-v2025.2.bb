LINUX_VERSION = "6.12.10"
YOCTO_META ?= "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-6.12;destsuffix=yocto-kmeta"
KBRANCH="xlnx_rebase_v6.12_LTS"
SRCREV = "78d6913dda146014f0dae43972c23d84c139c818"
SRCREV_meta = "5d9c6c5b0531161f9e8e9d108740ebcec9177398"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

# Disamiguiate 6.12.10-v2025.1 and 6.12.10-v2025.2
PV .= "+v2025.2"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
