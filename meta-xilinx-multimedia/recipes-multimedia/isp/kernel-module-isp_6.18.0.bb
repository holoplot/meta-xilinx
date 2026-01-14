# Define BRANCH and SRCREV for the 6.18 kernel.
SRC_BRANCH = "2026.1"
SRCREV = "11d6ccc45e817f149032addd8b9adc89fae4e653"

include kernel-module-isp.inc

PV .= "+git"
