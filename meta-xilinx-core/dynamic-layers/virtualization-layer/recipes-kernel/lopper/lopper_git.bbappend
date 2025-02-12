SRC_URI = "git://github.com/devicetree-org/lopper.git;branch=master;protocol=https"
SRCREV = "d671bd3c0d1b8b8fd2eb67675d07289a4fcd0274"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
