SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01070000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01070000.tar.gz"
SRC_URI[sha256sum] = "f56d02ccbfc33da31fe38cf473778b72afbd31bfa1fa2e308593932bdd10deac"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
