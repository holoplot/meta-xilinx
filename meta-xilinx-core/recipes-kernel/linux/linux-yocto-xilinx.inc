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

# MicroBlaze-v default generic KMACHINE
COMPATIBLE_MACHINE:riscv32 = "${MACHINE}"
KMACHINE:riscv32 = "${TUNE_RISCV_ARCH}"

COMPATIBLE_MACHINE:riscv64 = "${MACHINE}"
KMACHINE:riscv64 = "${TUNE_RISCV_ARCH}"
