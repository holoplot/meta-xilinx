SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10012023/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_10012023.tar.gz"
SRC_URI[sha256sum] = "a23ad95b59eb9c468234519ea25f9e6d3828ff0e9dd797b83bee8a2950c31dc7"

require openamp-fw-example-versal.inc
