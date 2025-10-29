SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.2;protocol=https"
SRCREV = "b3d8f7632900f916ba63e1778ef30ab3d481b518"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
