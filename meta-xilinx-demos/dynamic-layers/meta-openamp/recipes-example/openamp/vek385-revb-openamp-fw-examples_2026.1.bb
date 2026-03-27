SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03270000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03270000.tar.gz"
SRC_URI[sha256sum] = "07b3e8e40c4634794d0a571d915b6f62591d7668fe8f7eab64854e77460402c4"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
