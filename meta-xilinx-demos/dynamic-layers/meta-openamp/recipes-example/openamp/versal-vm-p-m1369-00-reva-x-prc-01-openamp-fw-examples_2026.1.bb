SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04061619/external/packagegroup-openamp-fw-examples/versal-vm-p-m1369-00-reva-x-prc-01-reva-multidomain_packagegroup-openamp-fw-examples_04061619.tar.gz"
SRC_URI[sha256sum] = "495d071cb9c933dacaf2aea96d7e7c125f7b6d00f7837e3a0a8d10584d75b2f6"

#OPENAMPFW_PKGDIR:versal = "versal-vm-p-m1369-00-reva-x-prc-01-reva-md_packagegroup-openamp-fw-examples"
require conf/includes/openamp-fw-example.inc
