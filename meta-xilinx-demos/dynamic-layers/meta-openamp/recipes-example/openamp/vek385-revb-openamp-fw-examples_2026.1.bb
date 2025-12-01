SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12010000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12010000.tar.gz"
SRC_URI[sha256sum] = "340f30e5cc76d993e2f3a0152415cbce2a77d306f689230273cd51831743577a"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
