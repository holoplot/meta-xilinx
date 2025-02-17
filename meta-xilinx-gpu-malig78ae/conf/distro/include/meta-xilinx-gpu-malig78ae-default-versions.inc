# libmali is selected by DISTRO_FEATURE of libmali & MACHINE_FEATURES of mali400
# lima is selected by DISTRO_FEATURE != libmali & MACHINE_FEATURES of mali400
# default mesa because otherwise
def xlnx_is_libmalig78ae_enabled(d):
    if bb.utils.contains('MACHINE_FEATURES', 'malig78ae', '1', '', d) == '1':
        if bb.utils.contains('DISTRO_FEATURES', 'libmali', '1', '', d) == '1':
            return True
    return False
