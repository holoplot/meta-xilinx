SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10020121/external/openamp-fw-examples/versal-vck190-sdt-seg_openamp-fw-examples_10020121.tar.gz"
SRC_URI[sha256sum] = "5d923932ce4cab5eee58684b9ad793c8b831930d6c1bc37aed3e3f7788b97941"

require openamp-fw-example-versal.inc
