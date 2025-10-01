SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10010000/external/openamp-fw-examples/versal-l20-sdt-seg_openamp-fw-examples_10010000.tar.gz"
SRC_URI[sha256sum] = "c898d0f73df5b31dd30c630fa97785c590be050dec9113b0a274fd1cd56716af"

require openamp-fw-example-versal.inc
