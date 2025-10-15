SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10150000.tar.gz"
SRC_URI[sha256sum] = "3459fd1e07bfe9c666e2b8d0adef8959c5797dad9b4c2ff56d0b94da9a646930"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
