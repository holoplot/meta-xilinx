SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09230048/external/packagegroup-openamp-fw-examples/versal-vrk165-sdt-seg_packagegroup-openamp-fw-examples_09230048.tar.gz"
SRC_URI[sha256sum] = "825bf50d2b3897c9fb7fbf576770bacd41b43a46bc97596476d6593397b1ec49"

require openamp-fw-example-versal.inc
