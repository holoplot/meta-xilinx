SUMMARY = "Firmware for ISP"
DESCRIPTION = "Firmware binaries provider for ISP"
LICENSE="CLOSED"

S = "${WORKDIR}"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/isp-firmware/2025.1/02240807/isp-r52-0-firmware.elf"
SRC_URI[sha256sum]="ab6c98e479ea3d439dfd172ba1fe0de94a89a8f29554a6b3c84a597c3fd0f8c1"

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
