SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01020305/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01020305.tar.gz"
SRC_URI[sha256sum] = "8a4a79ca2e1b3803de75303dd7c13c1753b3a7bd5dc83622f0c66eea782559fb"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
