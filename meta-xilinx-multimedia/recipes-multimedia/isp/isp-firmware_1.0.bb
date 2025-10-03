SUMMARY = "Firmware for ISP"
DESCRIPTION = "Firmware binaries provider for ISP"
LICENSE="CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ae254519d1cbab1bfd89ed89f6f6268d"
COMPATIBLE_HOST = ".*-linux"

S = "${WORKDIR}"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/isp-firmware/2025.2/09192025/isp_fw.tar.gz"
SRC_URI[sha256sum]="f06b09e35196bbe2613bde1d47ca15991c7332c68fd25d38bf4b6f180fb7b760"

PACKAGE_ARCH = "${MACHINE_ARCH}"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${base_libdir}/firmware
    install -Dm 0644 ${S}/isp-r52-6-firmware.elf ${D}${base_libdir}/firmware/isp-r52-6-firmware.elf
    install -Dm 0644 ${S}/isp-r52-7-firmware.elf ${D}${base_libdir}/firmware/isp-r52-7-firmware.elf
    install -Dm 0644 ${S}/isp-r52-8-firmware.elf ${D}${base_libdir}/firmware/isp-r52-8-firmware.elf
    install -Dm 0644 ${S}/isp-r52-9-firmware.elf ${D}${base_libdir}/firmware/isp-r52-9-firmware.elf
}

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:versal-2ve-2vm = "versal-2ve-2vm"

INSANE_SKIP:${PN} += "arch"

# Inhibit warnings about files being stripped
FILES:${PN} += "\
    ${base_libdir}/firmware/isp-r52-6-firmware.elf \
    ${base_libdir}/firmware/isp-r52-7-firmware.elf \
    ${base_libdir}/firmware/isp-r52-8-firmware.elf \
    ${base_libdir}/firmware/isp-r52-9-firmware.elf \
"
