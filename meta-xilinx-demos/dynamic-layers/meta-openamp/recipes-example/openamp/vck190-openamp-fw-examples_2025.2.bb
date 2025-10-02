SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10012023/external/openamp-fw-examples/versal-vck190-sdt-seg_openamp-fw-examples_10012023.tar.gz"
SRC_URI[sha256sum] = "2729c80051a27b8b171731fdef77aefa899e73c62847131edcb275c27af93662"

require openamp-fw-example-versal.inc
