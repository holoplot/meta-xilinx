SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12042024/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12042024.tar.gz"
SRC_URI[sha256sum] = "73c27885a4a1c6a0b4d0e0b299c78003311ec946375330a361c832d6610778fb"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
