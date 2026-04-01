SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04010000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04010000.tar.gz"
SRC_URI[sha256sum] = "12425e92564cd56014fa709c2aa0bd6d0b8c813f7a509df13f82301349fd00e5"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
