SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03110137/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03110137.tar.gz"
SRC_URI[sha256sum] = "4a1027448350ab7de9d61327adfd92454f7d6c88f1c0887d9c06deb5ba433cec"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
