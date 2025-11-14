SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/11140259/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11140259.tar.gz"
SRC_URI[sha256sum] = "832d351b4da6ca2fa8c290b2ec8b503c71495a4736ad349b5e0636320de30fa4"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
