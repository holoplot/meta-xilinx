SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/11010000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11010000.tar.gz"
SRC_URI[sha256sum] = "504670feb8f414b1ba0a9b93993b0341aa5ef68894b20f0f61aa3ee0a928fc77"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
