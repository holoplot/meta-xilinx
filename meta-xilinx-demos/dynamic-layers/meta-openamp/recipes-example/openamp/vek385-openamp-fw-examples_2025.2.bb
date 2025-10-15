SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150642/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10150642.tar.gz"
SRC_URI[sha256sum] = "c90b2afbfce6991132be279de9b63e88a7938eb5dd287baf38c844545f38addc"

require openamp-fw-example-versal.inc
