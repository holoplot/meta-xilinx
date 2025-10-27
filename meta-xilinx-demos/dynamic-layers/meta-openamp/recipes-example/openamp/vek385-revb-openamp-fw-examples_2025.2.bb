SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10270000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10270000.tar.gz"
SRC_URI[sha256sum] = "5c0be25f8f3ea6bae926f144deb500b86aad9e40bcbb48729be8450c5ab5e1bf"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
