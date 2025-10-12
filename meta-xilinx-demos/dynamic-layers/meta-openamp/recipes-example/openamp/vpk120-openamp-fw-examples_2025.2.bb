SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10112136/external/packagegroup-openamp-fw-examples/versal-vpk120-sdt-seg_packagegroup-openamp-fw-examples_10112136.tar.gz"
SRC_URI[sha256sum] = "f592e45ca04f96100635724cfa59749f52fa49ae2f5a397301f39aea21b248fb"

require openamp-fw-example-versal.inc
