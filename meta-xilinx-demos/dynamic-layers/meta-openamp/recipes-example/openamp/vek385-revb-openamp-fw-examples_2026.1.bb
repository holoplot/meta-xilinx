SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04051611/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04051611.tar.gz"
SRC_URI[sha256sum] = "b081fad36ee137bb50046d1a737b1f50aa549398b23832a15cd9764faa2e1dfe"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
