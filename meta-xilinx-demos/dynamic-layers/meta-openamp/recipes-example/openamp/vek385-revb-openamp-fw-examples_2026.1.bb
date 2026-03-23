SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03230252/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03230252.tar.gz"
SRC_URI[sha256sum] = "1ba82d4ce309ddb248bef8f1e08b6283cc1489721d55917dadd35047fa8c8260"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
