SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03040531/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-multidomain_openamp-zephyr-demo_03040531.tar.gz"
SRC_URI[sha256sum] = "5778b683419d22c33ff1d50d519436408a5d13cf87bc12b23c283da2d8763715"

OPENAMPFW_BOARD = "vek385"
require conf/includes/openamp-fw-example.inc
