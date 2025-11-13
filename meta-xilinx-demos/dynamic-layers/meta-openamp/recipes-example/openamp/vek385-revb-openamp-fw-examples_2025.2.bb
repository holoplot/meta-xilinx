SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/11130122/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11130122.tar.gz"
SRC_URI[sha256sum] = "44a051efacc81970350cf535ad817f89d1a6a623f3f4e2b643012b73b7d0bec1"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
