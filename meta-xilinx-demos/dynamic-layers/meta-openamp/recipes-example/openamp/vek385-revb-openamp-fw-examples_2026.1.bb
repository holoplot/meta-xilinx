SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04111910/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04111910.tar.gz"
SRC_URI[sha256sum] = "d0d606a32a69407cec4d14c5ab3f5f38ad671314b8ffe1f23dbff0f8c9a2c2e4"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
