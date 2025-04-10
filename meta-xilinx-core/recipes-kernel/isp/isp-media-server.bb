SUMMARY = "ISP Media Server and Libraries"
DESCRIPTION = "ISP Media Server application and required shared libraries."
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=bb0c8bccc6e0b47e992c34438e3a06fb"
COMPATIBLE_HOST = ".*-linux"

S = "${WORKDIR}"

SRC_URI = "https://petalinux.xilinx.com/sswreleases/isp-media-server/2025.1/04102331/isp-media-server.tar.gz"
SRC_URI[sha256sum]="e3c748c798a70adc5c2f6f2304ef064c8bd396b2980e151040c7048090f49b76"

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${bindir}

    # Install libraries with versioning and symlinks
    for fullso in *.so.*.*; do
        base=$(echo $fullso | sed -E 's/\.so\..*//')
        version=$(echo $fullso | sed -E 's/.*\.so\.//')
        soversion=$(echo $version | cut -d. -f1)

        install -m 0755 $fullso ${D}${libdir}/
        ln -sf $fullso ${D}${libdir}/${base}.so.${soversion}
        ln -sf ${base}.so.${soversion} ${D}${libdir}/${base}.so
    done

    # Install plain .so files (without versioning)
    for lib in *.so; do
        # Skip if a matching versioned file exists (already handled)
        if ls ${lib}.*.* 1>/dev/null 2>&1; then
            continue
        fi
        install -m 0755 $lib ${D}${libdir}/
    done

    # Install binary
    install -m 0755 isp_media_server ${D}${bindir}/
}

FILES:${PN} += "${libdir}/*.so* ${bindir}/isp_media_server"

# Disable all QA checks and stripping
INSANE_SKIP:${PN} += "file-rdeps arch already-stripped dev-so dev-elf ldflags dev-deps"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
do_populate_sysroot[noexec] = "1"

# Optional: mark package as arch-independent if safe
PACKAGE_ARCH = "${MACHINE_ARCH}"


FILES:${PN}-dev = ""


