SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10020121/external/openamp-fw-examples/versal-vek280-sdt-seg_openamp-fw-examples_10020121.tar.gz"
SRC_URI[sha256sum] = "4bd030474dd84fd98d27baa554251fefac0df3db8acd5fa3e0f435b8a4782c5c"

require openamp-fw-example-versal.inc
