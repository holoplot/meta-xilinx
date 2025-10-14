SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10140133/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10140133.tar.gz"
SRC_URI[sha256sum] = "de1ae727e9bb5f5a495412d9a9aacf77e0110480a8adb2279516e68e30b7dd08"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
