SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10010000/external/openamp-fw-examples/versal-vmk180-sdt-seg_openamp-fw-examples_10010000.tar.gz"
SRC_URI[sha256sum] = "eebd73f74ba0a2f92b06d2e419331f17c3253c9e35a2e823270c28bf14aee5e1"

require openamp-fw-example-versal.inc
