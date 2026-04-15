SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04151526/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04151526.tar.gz"
SRC_URI[sha256sum] = "358368c150b9a39377fa9c7b5c0f7a253e031807a2ab34c890607da63ec1ea1f"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
