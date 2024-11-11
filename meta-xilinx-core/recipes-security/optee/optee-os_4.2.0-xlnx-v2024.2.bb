require recipes-security/optee/optee-os.inc

DEPENDS += "dtc-native"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/Xilinx/optee/optee_os.git;branch=master;protocol=https"

SRCREV = "72af0f51b5604abbf177e767cf8fef6d2a9ecb16"

COMPATIBLE_MACHINE:versal2-generic = ".*"

OPTEEMACHINE:versal2-generic = "versal2"

OPTEE_ARCH ?= "arm64"

TOOLCHAIN = "gcc"

EXTRA_OEMAKE:append = " CFG_TEE_CORE_LOG_LEVEL=1 CFG_TEE_TA_LOG_LEVEL=1 \
       "
