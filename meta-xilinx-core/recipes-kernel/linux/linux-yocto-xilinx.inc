FILESEXTRAPATHS:prepend := "${THISDIR}/linux-xlnx:"

LINUX_MB_INC = ""
LINUX_MB_INC:microblaze = "linux-microblaze.inc"
require ${LINUX_MB_INC}

# Zynq default generic KMACHINE
COMPATIBLE_MACHINE:zynq = "zynq"
KMACHINE:zynq = "zynq"

# ZynqMP default generic KMACHINE
COMPATIBLE_MACHINE:zynqmp = "zynqmp"
KMACHINE:zynqmp = "zynqmp"

# MicroBlaze default generic KMACHINE
COMPATIBLE_MACHINE:microblaze = "microblaze"
KMACHINE:microblaze = "microblaze"

# MicroBlaze default generic KMACHINE
COMPATIBLE_MACHINE:microblaze-v-generic = "microblaze-v-generic"
KMACHINE:microblaze-v-generic = "${TUNE_RISCV_ARCH}"
