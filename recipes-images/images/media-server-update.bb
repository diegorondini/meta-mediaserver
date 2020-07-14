SUMMARY = "Update for a console image that includes file server features"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit swupdate

SRC_URI += " \
        file://sw-description \
"

IMAGE_DEPENDS += "media-server-image"
do_swuimage[recrdeptask] += "do_image_complete"

SWUPDATE_IMAGES += "media-server-image"
SWUPDATE_IMAGES_FSTYPES[media-server-image] = ".boot.img.zstd .root.img.zstd"

SWUPDATE_SIGNING = "RSA"
SWUPDATE_PRIVATE_KEY = "${BSPDIR}/sources/meta-updatefactory/recipes-support/swupdate/swupdate-uf/test-sign_priv.pem"
SWUPDATE_PASSWORD_FILE = "${BSPDIR}/sources/meta-updatefactory/recipes-support/swupdate/swupdate-uf/test-passphrase"
