SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.1;protocol=https"
SRCREV = "f63a9e92cce7a8bd43877bb83e1e11393876ff22"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
