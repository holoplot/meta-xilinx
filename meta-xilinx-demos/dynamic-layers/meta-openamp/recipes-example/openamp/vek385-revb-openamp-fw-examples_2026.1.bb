SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04101518/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04101518.tar.gz"
SRC_URI[sha256sum] = "710fbe66eb9edef5dc3a23676cfad43df8d8638587e6770292ec1c253a0f8156"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
