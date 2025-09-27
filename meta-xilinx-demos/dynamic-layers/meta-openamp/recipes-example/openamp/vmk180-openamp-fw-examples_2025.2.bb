SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09270000/external/packagegroup-openamp-fw-examples/versal-vmk180-sdt-seg_packagegroup-openamp-fw-examples_09270000.tar.gz"
SRC_URI[sha256sum] = "22bc453590b1ff3935a39fa194aa2dd94301dee3fbb2b01fde14cb40505df1ce"

require openamp-fw-example-versal.inc
