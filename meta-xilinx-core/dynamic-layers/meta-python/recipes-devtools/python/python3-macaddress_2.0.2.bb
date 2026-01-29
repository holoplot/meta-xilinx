SUMMARY = "MAC address manipulation library for Python"
HOMEPAGE = "https://github.com/mentalisttraceur/python-macaddress"
LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea2eb804531932406bb4957581a4b0f4"

SRC_URI[sha256sum] = "1400ccdc28d747102d57ae61e5b78d8985872930810ceb8860cd49abd1e1fa37"

inherit pypi setuptools3

BBCLASSEXTEND = "native nativesdk"
