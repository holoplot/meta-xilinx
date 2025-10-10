SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10100054/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10100054.tar.gz"
SRC_URI[sha256sum] = "fe2511283a0478a189dca8cdae4829be82bbaa8d24b451092273b4a95f839f69"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
