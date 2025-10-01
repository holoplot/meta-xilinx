SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10010000/external/openamp-fw-examples/versal-vek280-sdt-seg_openamp-fw-examples_10010000.tar.gz"
SRC_URI[sha256sum] = "5649d2061eecac2b1160451c19addbc903fdd54457da43b2564eeb8831641c86"

require openamp-fw-example-versal.inc
