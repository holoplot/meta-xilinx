IR_PATH ??= "${@d.getVarFlag('IR_PATH', d.getVar('MACHINE')) or ''}"
WEB_PATH ??= "${@d.getVarFlag('WEB_PATH', d.getVar('MACHINE')) or ''}"

# k26-smk
IR_PATH[k26-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k26-smk/ImgRecovery.elf'
SRC_URI[k26-smk-sdt_ir.sha256sum] = 'cb79959676e29695b770393e47caece4eb1dedce628a69ae078260a1a399e14a'

WEB_PATH[k26-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k26-smk/web.img'
SRC_URI[k26-smk-sdt_web.sha256sum] = '0825518aea24c3104a58b0f847436db03a92d8d4366baad6594c4d03de09d8cb'

# k24-smk
IR_PATH[k24-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k24-smk/ImgRecovery.elf'
SRC_URI[k24-smk-sdt_ir.sha256sum] = 'cb79959676e29695b770393e47caece4eb1dedce628a69ae078260a1a399e14a'

WEB_PATH[k24-smk-sdt] = 'https://petalinux.xilinx.com/sswreleases/rel-v2025.1/image-recovery/2025.1/2025.1_0408/k24-smk/web.img'
SRC_URI[k24-smk-sdt_web.sha256sum] = '0825518aea24c3104a58b0f847436db03a92d8d4366baad6594c4d03de09d8cb'
