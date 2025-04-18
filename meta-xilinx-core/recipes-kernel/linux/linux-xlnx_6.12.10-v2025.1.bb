LINUX_VERSION = "6.12.10"
YOCTO_META ?= "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-6.12;destsuffix=yocto-kmeta"
KBRANCH="xlnx_rebase_v6.12_LTS"
SRCREV = "6360a23576b725b377ca6f3a3e1bae392772101b"
SRCREV_meta = "5d9c6c5b0531161f9e8e9d108740ebcec9177398"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
