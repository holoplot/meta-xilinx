SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/10310000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_10310000.tar.gz"
SRC_URI[sha256sum] = "e83b035a94602891cde311220343f2ebf6804d148c75ffc38fd0fa83a1abc718"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
