SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12110000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12110000.tar.gz"
SRC_URI[sha256sum] = "cf70aa317de11cad5c6aa1abb94c280d2285af3fbd24009bd24aab3e0db43bd3"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
