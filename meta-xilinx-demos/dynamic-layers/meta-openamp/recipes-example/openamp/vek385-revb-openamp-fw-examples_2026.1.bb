SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04141457/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04141457.tar.gz"
SRC_URI[sha256sum] = "81c12ced7a2228c1d129d5ab8ea2a212d8ad935641e0414e1ae756433b610a8b"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
