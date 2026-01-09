SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01090000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01090000.tar.gz"
SRC_URI[sha256sum] = "313aeab15014768d9331fb4fbd78e760e148eb84ff70147ead8e8c35a4e66346"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
