# Prevents parse failrues on zynq

COMPATIBLE_MACHINE:zynq = "^$"

# Temporarily disable openamp for versal2 to prevent parse failrues.
COMPATIBLE_MACHINE:versal2 = "^$"
