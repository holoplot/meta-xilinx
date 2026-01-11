SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01110000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01110000.tar.gz"
SRC_URI[sha256sum] = "8faca257fa436d872f377735788deacd6dde95797959da9f62d827c0173716cd"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
