SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150000/external/packagegroup-openamp-fw-examples/versal-vck190-sdt-seg_packagegroup-openamp-fw-examples_10150000.tar.gz"
SRC_URI[sha256sum] = "cc77e755cbc9c650fc1280d1d520f2698e23079a84cb28d9ddda12bfcb8b3612"

require openamp-fw-example-versal.inc
