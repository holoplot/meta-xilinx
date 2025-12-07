SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12070000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12070000.tar.gz"
SRC_URI[sha256sum] = "a37c883cf9178a36f827fda7b4e3201e2b98e57622d16a74460cace1a49ce475"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
