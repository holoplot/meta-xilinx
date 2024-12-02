DESCRIPTION = "Minimal rootfs image for Image recovery"
LICENSE = "MIT"

require recipes-core/images/core-image-tiny-initramfs.bb

INITRAMFS_FSTYPES += "cpio.gz.u-boot imagercvry"

PACKAGE_INSTALL += "image-recovery-linux-dev tcf-agent mtd-utils i2c-tools"

