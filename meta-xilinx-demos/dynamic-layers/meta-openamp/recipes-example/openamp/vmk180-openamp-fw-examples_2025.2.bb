SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10012023/external/openamp-fw-examples/versal-vmk180-sdt-seg_openamp-fw-examples_10012023.tar.gz"
SRC_URI[sha256sum] = "d923f28ce9cb7518155d3634cc4983e56590caa6d69dbffc328c65087b5c0f2f"

require openamp-fw-example-versal.inc
