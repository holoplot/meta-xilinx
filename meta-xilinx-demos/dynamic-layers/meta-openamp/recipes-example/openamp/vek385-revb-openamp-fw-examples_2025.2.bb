SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10112136/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10112136.tar.gz"
SRC_URI[sha256sum] = "8f3df4613fa98bd83d562587d6d186fa5d7b7de93281f0555d48cbff2902b607"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
