SRC_URI = "git://github.com/Xilinx/lopper.git;branch=master;protocol=https"
SRCREV = "435a501acc8f6899ab01352ac7234c2425fd8287"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
