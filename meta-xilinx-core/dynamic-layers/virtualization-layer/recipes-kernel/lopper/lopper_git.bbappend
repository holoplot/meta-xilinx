SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.1;protocol=https"
SRCREV = "925070c899d460e07043a9afcd6f3c6eba49f53c"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
