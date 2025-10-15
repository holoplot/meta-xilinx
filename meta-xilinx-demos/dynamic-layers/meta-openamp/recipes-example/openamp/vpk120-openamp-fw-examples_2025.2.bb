SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150000/external/packagegroup-openamp-fw-examples/versal-vpk120-sdt-seg_packagegroup-openamp-fw-examples_10150000.tar.gz"
SRC_URI[sha256sum] = "c71f53b8c5f27f20d64c78029a55f2ec4bf0f35246b76d1267e414c81d11dd08"

require openamp-fw-example-versal.inc
