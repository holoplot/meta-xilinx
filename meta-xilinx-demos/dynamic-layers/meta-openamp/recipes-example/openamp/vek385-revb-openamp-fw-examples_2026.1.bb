SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/12310000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-revb-sdt-seg_openamp-zephyr-demo_12310000.tar.gz"
SRC_URI[sha256sum] = "f1f6b2ec87f8538905ca8ab0bdf1fbd8a6b40742da627e317103cd1bc9db4f6f"

OPENAMPFW_BOARD = "vek385-revb"
require conf/includes/openamp-fw-example.inc
