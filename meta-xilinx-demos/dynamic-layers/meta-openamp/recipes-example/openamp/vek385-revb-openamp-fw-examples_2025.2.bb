SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10190000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10190000.tar.gz"
SRC_URI[sha256sum] = "d5d7d134b90268c7239be5868f58bda91c9e0a5722c9875d0d484aa377f8e0ae"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
