SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/03250000/external/packagegroup-openamp-fw-examples/versal-vm-p-m1369-00-reva-x-prc-01-reva-multidomain_packagegroup-openamp-fw-examples_03250000.tar.gz"
SRC_URI[sha256sum] = "ccc015b6e4377ea708648604025bd79c3770e4ca91ab6d9963e72cb25c974edf"

#OPENAMPFW_PKGDIR:versal = "versal-vm-p-m1369-00-reva-x-prc-01-reva-md_packagegroup-openamp-fw-examples"
require conf/includes/openamp-fw-example.inc
