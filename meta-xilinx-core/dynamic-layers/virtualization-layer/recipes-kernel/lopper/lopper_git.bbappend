SRC_URI = "git://github.com/Xilinx/lopper.git;branch=master;protocol=https"
SRCREV = "3a3df0a33ea7ab7837f5cc20d3eaca21a2d603ed"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
