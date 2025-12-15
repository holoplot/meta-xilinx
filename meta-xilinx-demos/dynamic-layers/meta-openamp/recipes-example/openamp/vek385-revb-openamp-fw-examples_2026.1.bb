SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12150000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12150000.tar.gz"
SRC_URI[sha256sum] = "c86f6934d0388b344b3084b74f5d340164af19bd663da2e3f789585214ec85be"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
