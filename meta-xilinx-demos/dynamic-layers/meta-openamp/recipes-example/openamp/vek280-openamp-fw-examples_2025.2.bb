SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150000/external/packagegroup-openamp-fw-examples/versal-vek280-sdt-seg_packagegroup-openamp-fw-examples_10150000.tar.gz"
SRC_URI[sha256sum] = "c729b5fd5e5a2d8b48ecc07c1e49f6edb05ae2500ac9b972f689c0b350b96124"

require openamp-fw-example-versal.inc
