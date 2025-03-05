SRC_URI = "git://github.com/devicetree-org/lopper.git;branch=master;protocol=https"
SRCREV = "4f37e9287d567316a3ecd88d9cb03951b7e9b1c5"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
