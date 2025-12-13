SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12130000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12130000.tar.gz"
SRC_URI[sha256sum] = "688c4b2503eeeafda54a9c3243ca2ffa424a29ef8ceca1974634bfdebefe0abe"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
