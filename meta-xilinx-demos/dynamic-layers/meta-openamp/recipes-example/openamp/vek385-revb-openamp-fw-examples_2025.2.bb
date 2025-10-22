SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10220842/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10220842.tar.gz"
SRC_URI[sha256sum] = "e0467ac158af13b7b224fe2df2e9e20a35550b3c9c38d7149254454fb7d694e8"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
