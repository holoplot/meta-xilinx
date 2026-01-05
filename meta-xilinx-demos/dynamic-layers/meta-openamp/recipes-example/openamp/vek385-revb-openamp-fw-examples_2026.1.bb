SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/01050000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_01050000.tar.gz"
SRC_URI[sha256sum] = "6186dcdf6c0b90c11ab9270eec5b63336bbb8d0b93a47e399b1e03b41ad128e9"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
