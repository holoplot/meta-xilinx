SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10290000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10290000.tar.gz"
SRC_URI[sha256sum] = "e9321886590cc9924926353bcbe66c5e9aa66a1cbbdbf38563a25e595168cd3c"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
