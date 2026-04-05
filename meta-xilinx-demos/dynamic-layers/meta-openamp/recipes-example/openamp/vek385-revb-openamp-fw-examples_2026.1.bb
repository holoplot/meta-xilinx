SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04041611/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04041611.tar.gz"
SRC_URI[sha256sum] = "1ba2301c5c3548f666cc6bf67a345abff55bc37c2bee9659a8e33b20879a010d"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
