SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10280011/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10280011.tar.gz"
SRC_URI[sha256sum] = "404d62699e3bab70123782b71e8a1e3a18561c369bbccd37860162cfe70e9c78"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
