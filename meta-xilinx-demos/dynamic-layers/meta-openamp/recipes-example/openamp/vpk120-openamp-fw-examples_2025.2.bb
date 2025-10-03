SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09290000/external/packagegroup-openamp-fw-examples/versal-vpk120-sdt-seg_packagegroup-openamp-fw-examples_09290000.tar.gz"
SRC_URI[sha256sum] = "7323e2b3f836c03ff4ee797ca54d6ddc36bbe381695e5379411cb8c1fab95ca2"

require openamp-fw-example-versal.inc
