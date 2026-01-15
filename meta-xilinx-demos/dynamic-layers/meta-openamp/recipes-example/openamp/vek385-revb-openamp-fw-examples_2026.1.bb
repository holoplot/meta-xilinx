SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01150000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01150000.tar.gz"
SRC_URI[sha256sum] = "00e900def2bef58f7acbbc7d015083bcfd839e8e6052228013ee4df68423a474"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
