SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10140133/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10140133.tar.gz"
SRC_URI[sha256sum] = "130b83a20005492fc5dd3f090cad7ac020abb4e920f8bbb383790d3a73333ffd"

require openamp-fw-example-versal.inc
