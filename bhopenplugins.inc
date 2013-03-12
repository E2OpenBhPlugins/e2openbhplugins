DEPENDS += "enigma2"

SRC_URI = "git://github.com/E2OpenBhPlugins/${MODULE}.git;protocol=git"

S="${WORKDIR}/git"

SRCREV_pn-${PN} ?= "${AUTOREV}"
