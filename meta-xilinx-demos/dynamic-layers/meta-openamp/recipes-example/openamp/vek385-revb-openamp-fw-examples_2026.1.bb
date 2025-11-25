SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2026.1/edf_files/2026.1/11242242/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11242242.tar.gz"
SRC_URI[sha256sum] = "1ccf23ee4b3d794d332904e6ab69ab8548cce977787e9e7fea1b277463c7a247"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
