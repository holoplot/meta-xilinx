SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04061619/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04061619.tar.gz"
SRC_URI[sha256sum] = "a0f5883409244af0358b413f98d1db984b3c5183b435a72daaf7efdf94f814a1"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
