SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12232355/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12232355.tar.gz"
SRC_URI[sha256sum] = "d4055e976f1438211ba0bf74d5592e680c0248cc399b7181b66d30cb2dee8edb"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
