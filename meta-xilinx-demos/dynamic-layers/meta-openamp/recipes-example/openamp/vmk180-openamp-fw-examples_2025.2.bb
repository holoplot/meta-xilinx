SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09230048/external/packagegroup-openamp-fw-examples/versal-vmk180-sdt-seg_packagegroup-openamp-fw-examples_09230048.tar.gz"
SRC_URI[sha256sum] = "bc040f683f9ceed5cc8d884cc9e2412c707f5081224177e51317fcdf77fdc692"

require openamp-fw-example-versal.inc
