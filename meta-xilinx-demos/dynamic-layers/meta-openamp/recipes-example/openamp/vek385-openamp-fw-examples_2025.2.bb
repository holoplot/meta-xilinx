SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/09270000/external/openamp-zephyr-demo/versal-2ve-2vm-vek385-sdt-seg_openamp-zephyr-demo_09270000.tar.gz"
SRC_URI[sha256sum] = "580747acc7cec0905871020dcf5662e1775784978bba52b823b12c59f9459a77"

require openamp-fw-example-versal.inc
