SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09230048/external/packagegroup-openamp-fw-examples/versal-vpk120-sdt-seg_packagegroup-openamp-fw-examples_09230048.tar.gz"
SRC_URI[sha256sum] = "d2b9162994d92181b3725d347593a1e4bf1e6e61265053c311fec7d15213bdfa"

require openamp-fw-example-versal.inc
