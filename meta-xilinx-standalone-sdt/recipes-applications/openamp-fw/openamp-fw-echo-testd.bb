require openamp-fw.inc

PROVIDES:append:armv7r = " openamp-fw-echo-testd "
PROVIDES:append:armv8r = " openamp-fw-echo-testd "

OPENAMP_FW_NAME = "image_echo_test"
OPENAMP_XLNX_RECIPE = "open-amp-xlnx-echo"

RPROVIDES:${PN} += "openamp-fw-echo-testd"
