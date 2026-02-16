ATTR ?= ""
ATTR:zynqmp ?= "core=r5-1"
ATTR:versal ?= "core=r5-1"
ATTR:versal-net ?= "core=r52-1, cluster=0, tcmboot "
ATTR:versal-2ve-2vm ?= "core=r52-1, cluster=0, tcmboot "

# RPU1 BIF partition attributes
BIF_PARTITION_ATTR[rpu1-hello-world] ?= "${ATTR}"
BIF_PARTITION_IMAGE[rpu1-hello-world] ?= "${RECIPE_SYSROOT}/boot/rpu1-hello-world.elf"
BIF_PARTITION_ID[rpu1-hello-world] ?= "0x1c000000"
