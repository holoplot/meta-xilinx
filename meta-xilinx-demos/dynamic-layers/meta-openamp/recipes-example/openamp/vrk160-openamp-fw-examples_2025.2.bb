SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09290000/external/packagegroup-openamp-fw-examples/versal-vrk160-sdt-seg_packagegroup-openamp-fw-examples_09290000.tar.gz"
SRC_URI[sha256sum] = "b38751db444d695031a0b01d20cf2128a0fb6a6869b2e8f08c5abf2bb2716958"

require openamp-fw-example-versal.inc
