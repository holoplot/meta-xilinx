SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03210000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_03210000.tar.gz"
SRC_URI[sha256sum] = "4725c360fa941029911f6b6256ae96c7e9d9f5d51d68302880364dcae4107e3c"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
