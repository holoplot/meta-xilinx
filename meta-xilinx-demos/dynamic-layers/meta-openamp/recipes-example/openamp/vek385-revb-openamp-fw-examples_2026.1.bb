SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12090000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12090000.tar.gz"
SRC_URI[sha256sum] = "cbd4b183a55fbdec65524d2817ceb4871ca9c8e27804ee6541bbe493fd044ff4"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
