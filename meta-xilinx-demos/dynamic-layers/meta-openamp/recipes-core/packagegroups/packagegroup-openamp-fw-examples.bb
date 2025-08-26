DESCRIPTION = "OpenAMP firmware examples"

REQUIRED_DISTRO_FEATURES = "openamp"

inherit packagegroup

# packages common to all
OPENAMP_PACKAGES_FULL_INSTALL = ""

# CortexA72-specific (i.e. Versal Gen1) packages
OPENAMP_VERSAL_GEN1_FULL_INSTALL = " \
    l20-openamp-fw-examples \
    v80-openamp-fw-examples \
    vck190-openamp-fw-examples \
    vek280-openamp-fw-examples \
    vmk180-openamp-fw-examples \
    vpk120-openamp-fw-examples \
    vrk160-openamp-fw-examples \
    vrk165-openamp-fw-examples \
    "

# CortexA78-mali-specific (i.e. Versal Gen2) packages
OPENAMP_VERSAL_GEN2_FULL_INSTALL = " \
    vek385-openamp-fw-examples \
    "


OPENAMP_PACKAGES:append = " ${OPENAMP_PACKAGES_FULL_INSTALL}"
OPENAMP_PACKAGES:append:versal = " ${OPENAMP_VERSAL_GEN1_FULL_INSTALL}"
OPENAMP_PACKAGES:append:versal-2ve-2vm = " ${OPENAMP_VERSAL_GEN2_FULL_INSTALL}"

RDEPENDS:${PN} = "${OPENAMP_PACKAGES}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
INSANE_SKIP:${PN} += "arch"
