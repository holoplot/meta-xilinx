SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.1;protocol=https"
SRCREV = "27ce6cbfb435ebc96d2ee8504ee95bff78909cdf"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
