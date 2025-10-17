SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10170000/external/packagegroup-openamp-fw-examples/versal-vek280-sdt-seg_packagegroup-openamp-fw-examples_10170000.tar.gz"
SRC_URI[sha256sum] = "41ce2be741c9c505d797542cdcebba125ab121ff757d4a9f19a4ae1c638cd5c7"

require openamp-fw-example-versal.inc
