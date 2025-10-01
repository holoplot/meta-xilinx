SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10010000/external/openamp-fw-examples/versal-vck190-sdt-seg_openamp-fw-examples_10010000.tar.gz"
SRC_URI[sha256sum] = "8e5269b159eb7a1c74f1189c8b5f27714533b1bebafe664cf69c9e284c4d1cbc"

require openamp-fw-example-versal.inc
