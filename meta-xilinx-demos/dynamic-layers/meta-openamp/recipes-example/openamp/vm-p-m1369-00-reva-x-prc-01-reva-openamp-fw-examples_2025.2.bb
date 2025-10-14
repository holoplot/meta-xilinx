SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10140133/external/packagegroup-openamp-fw-examples/versal-vm-p-m1369-00-reva-x-prc-01-reva-sdt-seg_packagegroup-openamp-fw-examples_10140133.tar.gz"
SRC_URI[sha256sum] = "68daa0855443f04ff1f0eab1d97c4d638de2d35173d4d0b128bcd271c92598aa"

OPENAMPFW_BOARD = "vm-p-m1369-00-reva-x-prc-01-reva"
require openamp-fw-example-versal.inc
