SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/02110449/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_02110449.tar.gz"
SRC_URI[sha256sum] = "564a16617ea21ec21943d53d982eb1d34e5c41c6f049372254ce5028543e9ff0"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
