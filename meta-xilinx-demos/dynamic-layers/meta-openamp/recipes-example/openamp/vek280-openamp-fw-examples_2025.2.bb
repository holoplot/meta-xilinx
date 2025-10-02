SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10012023/external/openamp-fw-examples/versal-vek280-sdt-seg_openamp-fw-examples_10012023.tar.gz"
SRC_URI[sha256sum] = "69c884be1f56db009177ceebc3d16f60362dca171f390f17f32314f77a154a77"

require openamp-fw-example-versal.inc
