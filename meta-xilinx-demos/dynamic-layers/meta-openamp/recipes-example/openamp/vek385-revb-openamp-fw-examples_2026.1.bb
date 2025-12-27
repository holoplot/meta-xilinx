SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12270000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12270000.tar.gz"
SRC_URI[sha256sum] = "7faebfafa2f7fb462c3dbdab5db15dce2b5c0cdfa0938c82d5b0dc9a92b18f4e"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
