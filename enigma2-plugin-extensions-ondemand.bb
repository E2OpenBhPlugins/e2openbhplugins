MODULE = "OnDemand"
DESCRIPTION = "On Demand"

RDEPENDS_${PN} = "python-html python-lxml python-dnspython python-beautifulsoup python-simplejson"

SRCREV = ""

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc

require assume-gplv2.inc
