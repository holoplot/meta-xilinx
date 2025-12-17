SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12170000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12170000.tar.gz"
SRC_URI[sha256sum] = "0f778ebad72f859244188eec2ccd05d76cba98cb448d747d0a5ae9b52278e2bd"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
