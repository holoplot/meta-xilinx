# ESP mounting, not strictly necessary
RRECOMMENDS:${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'polkit', 'udisks2', '', d)}"
