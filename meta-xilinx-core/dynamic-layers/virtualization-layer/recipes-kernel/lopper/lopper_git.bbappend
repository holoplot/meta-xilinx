SRC_URI = "git://github.com/Xilinx/lopper.git;branch=master;protocol=https"
SRCREV = "dd0ceaa113b0faf053b0806188816bef263c35f2"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
