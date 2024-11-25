SUMMARY = "Firmware for ISP"
DESCRIPTION = "Firmware binaries provider for ISP"
LICENSE="CLOSED"

S = "${WORKDIR}"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/isp-firmware/2025.1/11141647/isp-r52-0-firmware.elf"
SRC_URI[sha256sum]="cc0be3889146bbf637dc16bbd0b10f771fa8ed4af6507761cc317b97a7bfe548"

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
