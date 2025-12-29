SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12290000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12290000.tar.gz"
SRC_URI[sha256sum] = "5dfce2e5a6049345e16f12574fd0102dd9f874b6768bf90c99646984b278100f"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
