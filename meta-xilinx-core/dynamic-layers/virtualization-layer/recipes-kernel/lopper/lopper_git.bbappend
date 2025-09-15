SRC_URI = "git://github.com/Xilinx/lopper.git;branch=master;protocol=https"
SRCREV = "d2f950a6ff5b7dbb6b53a5b91a32f05051901311"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
