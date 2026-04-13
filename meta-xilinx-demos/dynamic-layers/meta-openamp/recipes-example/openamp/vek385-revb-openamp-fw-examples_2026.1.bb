SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04131543/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04131543.tar.gz"
SRC_URI[sha256sum] = "a805d68d3de4c3d84856c92162aa333e9e091e02f9d188c23c5c4c451b6a652a"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
