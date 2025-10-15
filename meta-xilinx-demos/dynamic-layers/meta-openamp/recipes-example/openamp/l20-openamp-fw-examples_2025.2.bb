SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10100054/external/packagegroup-openamp-fw-examples/versal-l20-sdt-seg_packagegroup-openamp-fw-examples_10100054.tar.gz"
SRC_URI[sha256sum] = "8752ee17481bb12690236e473855f7fd0bb92dace350fd157eb47995c029d0cc"

require openamp-fw-example-versal.inc
