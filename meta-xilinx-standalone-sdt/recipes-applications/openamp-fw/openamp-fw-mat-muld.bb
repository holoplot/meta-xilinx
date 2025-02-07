require openamp-fw.inc

PROVIDES:append:armv7r = " openamp-fw-mat-muld "
PROVIDES:append:armv8r = " openamp-fw-mat-muld "

OPENAMP_FW_NAME = "image_matrix_multiply"
OPENAMP_XLNX_RECIPE = "open-amp-xlnx-matrix"

RPROVIDES:${PN} += "openamp-fw-mat-muld"
