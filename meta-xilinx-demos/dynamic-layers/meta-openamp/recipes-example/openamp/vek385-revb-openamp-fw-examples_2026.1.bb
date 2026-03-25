SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03250000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03250000.tar.gz"
SRC_URI[sha256sum] = "9f0a0cb55e8ae2b84834c32bf2a0fe623062bd238dd0449ded44efcacff22ee2"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
