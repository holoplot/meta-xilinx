SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10020121/external/openamp-fw-examples/versal-vpk120-sdt-seg_openamp-fw-examples_10020121.tar.gz"
SRC_URI[sha256sum] = "a4a4d1dd5180f7c5c9f605dba589730fce3876bdf760ffdaefd6b8707053cc5f"

require openamp-fw-example-versal.inc
