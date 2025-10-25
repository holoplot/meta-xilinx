SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10250000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10250000.tar.gz"
SRC_URI[sha256sum] = "50b3e83ac7bb15a64aa1f346fff17e48ef6bd68bb7b54ffc0d0df7fcca44789d"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
