SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03310000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03310000.tar.gz"
SRC_URI[sha256sum] = "f337fbe21394dad2a9566806e5a57a0296035239eb9272c8f3ece8d75396bd37"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
