SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.2;protocol=https"
SRCREV = "24d337b1150ab6f7b4aa29d115f0e2f5a79bb582"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
