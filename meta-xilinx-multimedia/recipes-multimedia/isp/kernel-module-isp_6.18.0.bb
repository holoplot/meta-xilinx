# Define BRANCH and SRCREV for the 6.18 kernel.
SRC_BRANCH = "2026.1"
SRCREV = "6b97f4ad0a69ad9686825e73b1ef26e0b1618fe6"

include kernel-module-isp.inc

PV .= "+git"
