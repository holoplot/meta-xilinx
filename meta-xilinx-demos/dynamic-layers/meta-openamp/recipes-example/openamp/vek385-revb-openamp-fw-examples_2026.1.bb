SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01130000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01130000.tar.gz"
SRC_URI[sha256sum] = "3924724942c0b946b22659cb348acfc7584ef5cb9a5dea89d66bfa6a43b49555"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
