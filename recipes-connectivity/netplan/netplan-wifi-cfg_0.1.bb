SUMMARY = "Netplan Wifi configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://wifi.yaml"

S = "${WORKDIR}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -d ${D}${sysconfdir}/netplan/
	install -m 0644 ${S}/wifi.yaml ${D}${sysconfdir}/netplan/wifi.yaml
}

FILES_${PN} = "${sysconfdir}/netplan"
