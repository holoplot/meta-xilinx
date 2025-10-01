SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10010000/external/openamp-fw-examples/versal-vpk120-sdt-seg_openamp-fw-examples_10010000.tar.gz"
SRC_URI[sha256sum] = "961e05fd3908c0e13150ce858d1c66272d230f53fb2bb40f7244aeb5486230b7"

require openamp-fw-example-versal.inc
