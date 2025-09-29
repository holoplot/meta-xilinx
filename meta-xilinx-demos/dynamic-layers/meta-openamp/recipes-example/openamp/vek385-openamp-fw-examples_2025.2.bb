SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09290000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_09290000.tar.gz"
SRC_URI[sha256sum] = "4b480acc89991f3d05296fe5f967df00d9d1fe75b8075a8522d1204b39617792"

require openamp-fw-example-versal.inc
