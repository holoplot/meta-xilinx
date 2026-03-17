SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03170000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03170000.tar.gz"
SRC_URI[sha256sum] = "4fdb84f52d092ad5ac26a24625908d58e270e0ae13e7dd7c95cc5eb5d8cb6f45"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
