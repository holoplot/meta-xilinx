IR_PATH ??= "${@d.getVarFlag('IR_PATH', d.getVar('MACHINE')) or ''}"
WEB_PATH ??= "${@d.getVarFlag('WEB_PATH', d.getVar('MACHINE')) or ''}"

# k26-smk
IR_PATH[k26-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k26-smk/ImageRecovery.elf'
SRC_URI[k26-smk-sdt.sha256sum] = '0000000000000000000000000000000000000000000000000000000000000000'

EB_PATH[k26-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k26-smk/web.img'
RC_URI[k26-smk-sdt_web.sha256sum] = '0000000000000000000000000000000000000000000000000000000000000000'

# k24-smk
IR_PATH[k24-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k24-smk/ImageRecovery.elf'
SRC_URI[k24-smk-sdt.sha256sum] = '0000000000000000000000000000000000000000000000000000000000000000'

EB_PATH[k24-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k24-smk/web.img'
RC_URI[k24-smk-sdt_web.sha256sum] = '0000000000000000000000000000000000000000000000000000000000000000'
