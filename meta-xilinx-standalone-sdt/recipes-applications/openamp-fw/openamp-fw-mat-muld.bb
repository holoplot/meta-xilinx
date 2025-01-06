require openamp-fw.inc

PROVIDES:append:armv7r = " openamp-fw-mat-muld "
PROVIDES:append:armv8r = " openamp-fw-mat-muld "

OPENAMP_FW_NAME = "image_matrix_multiply"
OPENAMP_XLNX_RECIPE = "open-amp-xlnx-matrix"
OPENAMP_FW_SRC_NAME = "${OPENAMP_XLNX_RECIPE}.elf"
