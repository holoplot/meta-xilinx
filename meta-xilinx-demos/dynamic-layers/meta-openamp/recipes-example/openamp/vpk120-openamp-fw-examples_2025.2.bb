SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10140133/external/packagegroup-openamp-fw-examples/versal-vpk120-sdt-seg_packagegroup-openamp-fw-examples_10140133.tar.gz"
SRC_URI[sha256sum] = "e999c3a92680c602cc978816c52d6204f48c005804940e4b38482c4cbea4f462"

require openamp-fw-example-versal.inc
