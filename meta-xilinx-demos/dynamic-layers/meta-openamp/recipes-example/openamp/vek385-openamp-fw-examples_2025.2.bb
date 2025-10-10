SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10100054/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10100054.tar.gz"
SRC_URI[sha256sum] = "ea75f666213ee202764dfcdbcf6422abdecf4f8bd12b319a203c1d5f162efc4f"

require openamp-fw-example-versal.inc
