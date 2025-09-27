SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09270000/external/packagegroup-openamp-fw-examples/versal-vrk160-sdt-seg_packagegroup-openamp-fw-examples_09270000.tar.gz"
SRC_URI[sha256sum] = "29d22e07289c38255427b523aa2e44427fced0eaecedd41ccddcd8258e9a8f6c"

require openamp-fw-example-versal.inc
