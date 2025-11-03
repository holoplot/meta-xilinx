SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/11030554/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11030554.tar.gz"
SRC_URI[sha256sum] = "c57dac12d3daf6e15e049b500dcde04cfffcc58851502eb0cc53092e8b0c92c5"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
