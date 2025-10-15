SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150000/external/packagegroup-openamp-fw-examples/versal-vmk180-sdt-seg_packagegroup-openamp-fw-examples_10150000.tar.gz"
SRC_URI[sha256sum] = "cbb32e920712262f4196feaca1e7cd788e50632de3dc66174864dadf11c5bf09"

require openamp-fw-example-versal.inc
