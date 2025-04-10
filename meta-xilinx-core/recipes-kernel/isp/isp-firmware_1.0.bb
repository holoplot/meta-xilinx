SUMMARY = "Firmware for ISP"
DESCRIPTION = "Firmware binaries provider for ISP"
LICENSE="CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=bb0c8bccc6e0b47e992c34438e3a06fb"
COMPATIBLE_HOST = ".*-linux"

S = "${WORKDIR}"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/isp-firmware/2025.1/04101709/isp_fw.tar.gz"
SRC_URI[sha256sum]="d82506caa2946acc4bd7f8703298dc45cb662879b505643e8e32ef41ad0bb536"

PACKAGE_ARCH = "${MACHINE_ARCH}"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${base_libdir}/firmware
    install -Dm 0644 ${S}/isp-r52-6-firmware.elf ${D}${base_libdir}/firmware/isp-r52-6-firmware.elf
}

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal2 = "versal2"

INSANE_SKIP:${PN} += "arch"

# Inhibit warnings about files being stripped
FILES:${PN} += "${base_libdir}/firmware/isp-r52-6-firmware.elf"
