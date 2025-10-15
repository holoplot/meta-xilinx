SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10150000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10150000.tar.gz"
SRC_URI[sha256sum] = "68bac87614522706f2b8170d2185ee0ec38d86e1acc1103a55d149381d83c695"

require openamp-fw-example-versal.inc
