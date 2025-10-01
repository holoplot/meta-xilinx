SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10010000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10010000.tar.gz"
SRC_URI[sha256sum] = "a52306600337fa899d92cb6a256603a79e4e483dee7c773939c3ec0c0597295a"

require openamp-fw-example-versal.inc
