SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03050000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-multidomain_openamp-zephyr-demo_03050000.tar.gz"
SRC_URI[sha256sum] = "15a88d96fe773edb713ab30f66938c574b6e4d54cb07c588e0f10e12d792d67b"

OPENAMPFW_BOARD = "vek385"
require conf/includes/openamp-fw-example.inc
