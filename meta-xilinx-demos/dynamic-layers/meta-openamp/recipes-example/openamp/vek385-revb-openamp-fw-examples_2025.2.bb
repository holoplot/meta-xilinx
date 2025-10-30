SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10300026/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10300026.tar.gz"
SRC_URI[sha256sum] = "d35c7ce127a1df7e5323ccca682ad4e3baaf8715829525a87680f142ac344cb4"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
