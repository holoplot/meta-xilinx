SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150642/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10150642.tar.gz"
SRC_URI[sha256sum] = "924bf3af5f5bcb7c7ac460a8b26551c27a36c852c9d821c0d3d13bc8929722aa"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
