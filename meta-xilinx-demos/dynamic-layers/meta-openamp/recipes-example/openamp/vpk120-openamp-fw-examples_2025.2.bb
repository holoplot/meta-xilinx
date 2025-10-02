SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10012023/external/openamp-fw-examples/versal-vpk120-sdt-seg_openamp-fw-examples_10012023.tar.gz"
SRC_URI[sha256sum] = "1abe1bd70cdb014b9e62e3992243459a89c227b769e4ea060a7bbfa5167e9af0"

require openamp-fw-example-versal.inc
