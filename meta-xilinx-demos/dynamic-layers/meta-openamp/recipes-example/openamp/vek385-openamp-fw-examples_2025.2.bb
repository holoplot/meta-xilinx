SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09230048/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_09230048.tar.gz"
SRC_URI[sha256sum] = "f86508af7d2b0ee9060b703dc174db9cdff00ba976664663ea293b0192e6181e"

require openamp-fw-example-versal.inc
