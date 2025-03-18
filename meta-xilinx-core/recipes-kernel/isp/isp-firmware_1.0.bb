SUMMARY = "Firmware for ISP"
DESCRIPTION = "Firmware binaries provider for ISP"
LICENSE="CLOSED"

S = "${WORKDIR}"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/isp-firmware/2025.1/03171107/isp-r52-6-firmware.elf"
SRC_URI[sha256sum]="72b092d32481a753781d554a45569fa22babdb25ad25da260b73f7ff035dfa7c"

PACKAGE_ARCH = "${MACHINE_ARCH}"
do_compile[noexec] = "1"

do_install() {
	install -d ${D}${base_libdir}/firmware
    install -Dm 0644 ${S}/isp-r52-0-firmware.elf ${D}${base_libdir}/firmware/isp-r52-0-firmware.elf
}

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal2 = "versal2"

INSANE_SKIP:${PN} += "arch"

# Inhibit warnings about files being stripped
FILES:${PN} += "${base_libdir}/firmware/isp-r52-0-firmware.elf"
