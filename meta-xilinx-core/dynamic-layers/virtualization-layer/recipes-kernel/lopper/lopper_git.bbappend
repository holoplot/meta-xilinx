SRC_URI = "git://github.com/Xilinx/lopper.git;branch=xlnx_rel_v2025.2;protocol=https"
SRCREV = "df832a1e5ae93a3ba76c178d01b128f054d78e9c"

FILESEXTRAPATHS:prepend := "${THISDIR}/lopper:"

BASEVERSION = "1.3.0"

RDEPENDS:${PN} += " \
    python3-ruamel-yaml \
    python3-anytree \
    python3-six \
    python3-pyyaml \
    python3-packaging \
    "
