SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/11112340/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11112340.tar.gz"
SRC_URI[sha256sum] = "6da47b44d83c4c8a46de96783868db06b28884979fd3f7fae2a8e8fdb369479e"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
