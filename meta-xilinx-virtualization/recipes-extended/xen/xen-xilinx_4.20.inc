SRCREV = "566ec8606a4592c51f05e373582edc793d128055"
XEN_URI = "git://github.com/Xilinx/xen.git;protocol=https"
XEN_BRANCH = "xlnx_rebase_4.20"

PV .= "-xilinx+git"

DEFAULT_PREFERENCE = "+1"

SRC_URI = " \
    ${XEN_URI};branch=${XEN_BRANCH} \
    file://0001-python-pygrub-pass-DISTUTILS-xen-4.19.patch \
    "
