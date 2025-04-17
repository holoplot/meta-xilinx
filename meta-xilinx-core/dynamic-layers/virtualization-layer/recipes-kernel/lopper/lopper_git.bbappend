SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.1;protocol=https"
SRCREV = "ef7b97370d99c9469fb85efb84d7e4d01c37f050"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
