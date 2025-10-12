SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10112136/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10112136.tar.gz"
SRC_URI[sha256sum] = "fc68f9dc39afb72d07a7e415ad3ce4e7e3b96455c94de5ac51d4bdd40a135494"

require openamp-fw-example-versal.inc
