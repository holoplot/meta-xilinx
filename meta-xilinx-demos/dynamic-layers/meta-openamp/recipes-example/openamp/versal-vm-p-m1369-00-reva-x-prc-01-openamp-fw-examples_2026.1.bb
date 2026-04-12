SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04111910/external/packagegroup-openamp-fw-examples/versal-vm-p-m1369-00-reva-x-prc-01-reva-multidomain_packagegroup-openamp-fw-examples_04111910.tar.gz"
SRC_URI[sha256sum] = "9a769ed46925a29cab1497d9aeff1b2c3bbae4fec8c2d0dd39d2d68b42493aa3"

#OPENAMPFW_PKGDIR:versal = "versal-vm-p-m1369-00-reva-x-prc-01-reva-md_packagegroup-openamp-fw-examples"
require conf/includes/openamp-fw-example.inc
