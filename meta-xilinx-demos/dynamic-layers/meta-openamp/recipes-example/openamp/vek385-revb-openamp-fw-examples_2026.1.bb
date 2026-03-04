SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03040531/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03040531.tar.gz"
SRC_URI[sha256sum] = "84917b14c86f04c3f14174cc0ae04ff6c4b59517e93793e959d5ae3909c72210"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
