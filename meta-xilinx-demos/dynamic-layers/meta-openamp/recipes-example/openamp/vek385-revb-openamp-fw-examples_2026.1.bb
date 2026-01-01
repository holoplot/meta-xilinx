SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01010000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01010000.tar.gz"
SRC_URI[sha256sum] = "9bfffac38245b282aa62377d3359b758eb8a6a9d6287fe9fa10c6c37a3ab6834"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
