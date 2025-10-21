SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10210000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10210000.tar.gz"
SRC_URI[sha256sum] = "684e883b358434aa9696897deb6f75d9896143d3583204058760386889a2bbe1"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
