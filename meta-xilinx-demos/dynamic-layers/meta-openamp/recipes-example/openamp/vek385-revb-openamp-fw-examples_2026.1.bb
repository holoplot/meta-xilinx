SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04021511/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04021511.tar.gz"
SRC_URI[sha256sum] = "69c7d8232be156ec52008f92b181f7d0b2622f3e0257b9eb2830987aa1199738"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
