SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10100054/external/packagegroup-openamp-fw-examples/versal-vpk120-sdt-seg_packagegroup-openamp-fw-examples_10100054.tar.gz"
SRC_URI[sha256sum] = "6dc44694bf440525932e1d5fbf09350489fa8796e397aca258d790af36a7b020"

require openamp-fw-example-versal.inc
