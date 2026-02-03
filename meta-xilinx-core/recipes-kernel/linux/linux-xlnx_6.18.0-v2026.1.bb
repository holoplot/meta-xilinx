LINUX_VERSION = "6.18.0"
YOCTO_META ?= "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-6.18;destsuffix=yocto-kmeta"
KBRANCH="xlnx_rebase_v6.18_LTS"
SRCREV = "00a79cd1cc6347f2ac692784a9105017fe4a6de3"
SRCREV_meta = "f202157d297182244bde71c8ed8b6d4946deec8f"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

PV .= "+v2026.1"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
