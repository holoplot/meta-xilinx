require recipes-security/optee/optee-client.inc

SRCREV = "9d6f69844ff60ec0966cf3659abcc38eda8b31ea"

inherit pkgconfig
DEPENDS += "util-linux"
EXTRA_OEMAKE += "PKG_CONFIG=pkg-config"
