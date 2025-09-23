SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09230048/external/packagegroup-openamp-fw-examples/versal-vrk160-sdt-seg_packagegroup-openamp-fw-examples_09230048.tar.gz"
SRC_URI[sha256sum] = "4f41ed5112e610eea75077b1dcaa3ccc745660136e51b556ea10f23a2df905ac"

require openamp-fw-example-versal.inc
