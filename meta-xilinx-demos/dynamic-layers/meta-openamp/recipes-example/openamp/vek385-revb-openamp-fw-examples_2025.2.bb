SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10231959/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10231959.tar.gz"
SRC_URI[sha256sum] = "976fe68f92c168175065a4ae18ffbc6f28568984f1eb6f22c39e660a278bbf55"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
