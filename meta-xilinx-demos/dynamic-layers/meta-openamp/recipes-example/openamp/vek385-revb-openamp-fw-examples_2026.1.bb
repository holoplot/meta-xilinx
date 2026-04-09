SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04091534/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04091534.tar.gz"
SRC_URI[sha256sum] = "0fc23fd890866198e3c1576098740f0adadb71f1a3554668b3076ed16ce0a994"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
