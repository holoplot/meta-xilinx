SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10020121/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10020121.tar.gz"
SRC_URI[sha256sum] = "618baebd814ebab8e347aeea517e8937c4cf391f8b38b1252ff922af4d2d2abe"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
