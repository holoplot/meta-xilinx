inherit esw

ESW_COMPONENT_SRC = "/lib/sw_services/xilloader/src/"
ESW_COMPONENT_NAME = "libxilloader.a"

DEPENDS += " \
    xilstandalone \
    libxil \
    xilpm \
    xilpdi \
    xilffs \
    xilsecure \
    xilpuf \
    xilsem \
    ${@'xilocp' if d.getVar('ESW_MACHINE') == 'psx_cortexa78_0' \
        or d.getVar('ESW_MACHINE') == 'psx_cortexr52_0' \
        or d.getVar('ESW_MACHINE') == 'psx_pmc_0' \
        or d.getVar('ESW_MACHINE') == 'cortexa78_0' \
        or d.getVar('ESW_MACHINE') == 'cortexr52_0' \
        or d.getVar('ESW_MACHINE') == 'pmc_0' else ''} \
    cframe \
    "
