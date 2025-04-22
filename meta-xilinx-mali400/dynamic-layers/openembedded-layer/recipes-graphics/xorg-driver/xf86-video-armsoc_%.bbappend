FILESEXTRAPATHS:prepend := "${THISDIR}/xf86-video-armsoc:"

EXTRA_MALI400_SRC = " file://0001-xf86-video-armosc-Accelerate-picture-composition.patch \
                      file://0001-xf86-video-armosc-Option-to-control-acceleration.patch \
                    "
SRC_URI:append = "${@bb.utils.contains('MACHINE_FEATURES', 'mali400', '${EXTRA_MALI400_SRC}', '', d)}"

DEPENDS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'mali400', ' libmali-xlnx', '', d)}"

