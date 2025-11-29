SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/11290000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11290000.tar.gz"
SRC_URI[sha256sum] = "2377655fe20cd580b94fde5947304399a715c5d4ed358fd23b8ce065a1364eae"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
