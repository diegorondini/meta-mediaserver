SUMMARY = "Add media user"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

EXCLUDE_FROM_WORLD = "1"

inherit useradd

USERADD_PACKAGES = "${PN}"

USERADD_PARAM_${PN} = "-u 1000 -d /home/media -r -s /bin/sh -g media -P 'media' media"

GROUPADD_PARAM_${PN} = "-g 1000 media"

do_install () {
	install -d -m 755 ${D}/home/media/sd
	install -d -m 755 ${D}/home/media/usb
	chown -R media ${D}/home/media
	chgrp -R media ${D}/home/media
}

FILES_${PN} = "/home/media/*"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
