SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10020121/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10020121.tar.gz"
SRC_URI[sha256sum] = "53827a7cdee4e8de8f7099d0a3ff5f1e69e8a063ff53f69c85d804d842935e4e"

require openamp-fw-example-versal.inc
