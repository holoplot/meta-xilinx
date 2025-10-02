SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/rel-v2025.2/edf_files/2025.2/10020121/external/openamp-fw-examples/versal-vmk180-sdt-seg_openamp-fw-examples_10020121.tar.gz"
SRC_URI[sha256sum] = "05a79ad9aced4c8f1fe26a425216bb10b055e8273e32b1bb397519adb3c2ec9f"

require openamp-fw-example-versal.inc
