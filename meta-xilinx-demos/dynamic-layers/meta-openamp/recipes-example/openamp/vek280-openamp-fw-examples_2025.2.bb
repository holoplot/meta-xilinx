SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10100054/external/packagegroup-openamp-fw-examples/versal-vek280-sdt-seg_packagegroup-openamp-fw-examples_10100054.tar.gz"
SRC_URI[sha256sum] = "c36cf5753b4db9ad468baec1f531dc05961e369c130cc2f7f5512ad6b239dc8b"

require openamp-fw-example-versal.inc
