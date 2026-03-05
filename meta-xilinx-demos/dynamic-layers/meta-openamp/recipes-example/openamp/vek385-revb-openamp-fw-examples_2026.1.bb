SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03050000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03050000.tar.gz"
SRC_URI[sha256sum] = "902021b37b4d609a592471fedb4fdecfc4a63d5be53263b6182d56775a6d7677"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
