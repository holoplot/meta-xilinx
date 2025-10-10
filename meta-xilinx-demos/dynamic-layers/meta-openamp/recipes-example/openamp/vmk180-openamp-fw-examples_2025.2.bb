SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10100054/external/packagegroup-openamp-fw-examples/versal-vmk180-sdt-seg_packagegroup-openamp-fw-examples_10100054.tar.gz"
SRC_URI[sha256sum] = "3d3593fb7342a9d1849a1ff242508aad46cb376caa125ed80cd92cebf5797c51"

require openamp-fw-example-versal.inc
