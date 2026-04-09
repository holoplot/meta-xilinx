SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04082004/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-multidomain_openamp-zephyr-demo_04082004.tar.gz"
SRC_URI[sha256sum] = "40d7a5fb8d1154c5c484104893833b5c0e7bf658a2c1ef527106e3e7ed83488b"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
