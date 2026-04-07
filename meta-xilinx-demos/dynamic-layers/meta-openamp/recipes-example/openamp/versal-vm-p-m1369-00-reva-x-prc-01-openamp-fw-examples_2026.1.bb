SUMMARY = "OpenAMP firmware examples demo payload processing"
DESCRIPTION = "OpenAMP firmware examples demo payload processing"
LICENSE = "CLOSED"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/edf_files/2026.1/04071529/external/packagegroup-openamp-fw-examples/versal-vm-p-m1369-00-reva-x-prc-01-reva-multidomain_packagegroup-openamp-fw-examples_04071529.tar.gz"
SRC_URI[sha256sum] = "a44f3707d741ca35bd6a7b8eff027061b4988963e7dafc73c88f60962d222f54"

#OPENAMPFW_PKGDIR:versal = "versal-vm-p-m1369-00-reva-x-prc-01-reva-md_packagegroup-openamp-fw-examples"
require conf/includes/openamp-fw-example.inc
