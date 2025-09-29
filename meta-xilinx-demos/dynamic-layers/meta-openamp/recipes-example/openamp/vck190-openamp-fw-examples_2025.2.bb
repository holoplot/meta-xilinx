SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09290000/external/packagegroup-openamp-fw-examples/versal-vck190-sdt-seg_packagegroup-openamp-fw-examples_09290000.tar.gz"
SRC_URI[sha256sum] = "e324c0385c8af44a9e3b9dd0af061c4443de27d5cb1a8b90298bcbe1e0b09092"

require openamp-fw-example-versal.inc
