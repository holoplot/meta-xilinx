SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04071529/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04071529.tar.gz"
SRC_URI[sha256sum] = "6ba8d30667ca6b6d80f1e20ca606feb84220e29663aace5d56e72cbe42ebb164"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
