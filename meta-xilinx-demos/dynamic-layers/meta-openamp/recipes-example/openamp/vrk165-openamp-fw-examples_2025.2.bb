SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09290000/external/packagegroup-openamp-fw-examples/versal-vrk165-sdt-seg_packagegroup-openamp-fw-examples_09290000.tar.gz"
SRC_URI[sha256sum] = "a287050f1b6be41633539d804894561f060193e2b0e147b895cf46522bf383c0"

require openamp-fw-example-versal.inc
