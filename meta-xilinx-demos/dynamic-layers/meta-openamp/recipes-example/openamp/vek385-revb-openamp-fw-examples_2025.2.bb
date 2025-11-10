SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/edf_files/2025.2/11100846/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_11100846.tar.gz"
SRC_URI[sha256sum] = "1eb1613bb63faa4cea45e048a5b753098e2f13bab98cf015b452b446f7c39550"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
