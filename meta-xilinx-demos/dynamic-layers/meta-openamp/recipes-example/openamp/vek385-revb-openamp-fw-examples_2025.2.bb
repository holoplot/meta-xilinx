SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10220422/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10220422.tar.gz"
SRC_URI[sha256sum] = "9916f6d9c3faab1a49d89d10ae9465cc8d106cf5c659f39b7568340e23e9ba90"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
