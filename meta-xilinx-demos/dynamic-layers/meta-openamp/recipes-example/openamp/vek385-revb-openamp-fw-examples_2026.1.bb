SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03290038/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03290038.tar.gz"
SRC_URI[sha256sum] = "6201dedb03f6c111a6970c778c96bda653192602a03f32530e31db67ce57d02c"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
