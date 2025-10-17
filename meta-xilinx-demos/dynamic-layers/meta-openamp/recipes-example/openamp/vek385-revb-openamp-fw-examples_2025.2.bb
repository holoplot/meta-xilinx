SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10170000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10170000.tar.gz"
SRC_URI[sha256sum] = "d5dc4fc270477b254348acc848a7525745368bcc7b7b97810a58bac8cbd06b5a"

OPENAMPFW_BOARD = "vek385-revb"
require openamp-fw-example-versal.inc
