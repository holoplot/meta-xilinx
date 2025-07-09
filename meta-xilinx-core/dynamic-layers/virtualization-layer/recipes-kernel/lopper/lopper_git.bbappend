SRC_URI = "git://github.com/Xilinx/lopper.git;branch=master;protocol=https"
SRCREV = "fc5eb19c034c4a2cd9d973138bdb4aa3602287a2"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
