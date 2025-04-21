SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.1;protocol=https"
SRCREV = "b523d4a431eadbdf930c65e0095000aec7c4e8c4"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.2.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
