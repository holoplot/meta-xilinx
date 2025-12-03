SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12030000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12030000.tar.gz"
SRC_URI[sha256sum] = "4a84d502890c2de6eb8a3104c9f7dafcba77648377784a9e102cc77c96d38428"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
