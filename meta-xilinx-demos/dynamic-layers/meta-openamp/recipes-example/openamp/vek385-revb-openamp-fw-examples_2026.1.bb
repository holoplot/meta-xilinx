SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04121811/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04121811.tar.gz"
SRC_URI[sha256sum] = "74127b3011c46e9c241db32387072aa9f5aaae7a0aff500dd811b61500c127fc"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
