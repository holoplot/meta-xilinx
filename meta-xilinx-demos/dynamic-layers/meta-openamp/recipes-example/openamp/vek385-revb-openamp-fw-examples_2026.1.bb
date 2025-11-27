SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/11262343/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11262343.tar.gz"
SRC_URI[sha256sum] = "de44fd7e21c50bfbbde69b4f77576fe8d3a17a9d85b3eaeb138c01fc0a122766"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
