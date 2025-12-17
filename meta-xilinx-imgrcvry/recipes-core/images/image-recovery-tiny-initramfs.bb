DESCRIPTION = "Minimal rootfs image for Image recovery"
LICENSE = "MIT"

require recipes-core/images/core-image-tiny-initramfs.bb

# Do not include boot files in the image
IMAGE_BOOT_FILES = ""

# Make sure the corresponding kernel is also built and deployed
EXTRA_IMAGEDEPENDS += "${KERNEL_DEPLOY_DEPEND}"

IMAGE_CLASSES += "image-types-imgrcvry"

IMAGE_TYPEDEP:imagercvry = "cpio.lzma.u-boot"
INITRAMFS_FSTYPES += "${IMAGE_TYPEDEP:imagercvry} imagercvry"

PACKAGE_INSTALL = "imgrcvry-initramfs-live-boot-tiny packagegroup-core-boot dropbear \
		${VIRTUAL-RUNTIME_base-utils} ${VIRTUAL-RUNTIME_dev_manager} base-passwd \
		image-recovery-linux-dev mtd-utils i2c-tools libubootenv-bin ufs-utils bmap-writer bash \
		"
PACKAGE_INSTALL += " fwenv-initramfs "
