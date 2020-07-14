SUMMARY = "A console image that includes file server features"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit core-image

# Use openssh
IMAGE_FEATURES += "\
	ssh-server-openssh \
"

# Media user
IMAGE_INSTALL += "\
	media-user \
"

# Network config
IMAGE_INSTALL += "\
	netplan \
	netplan-wifi-cfg \
	avahi-daemon \
"

# File servers
IMAGE_INSTALL += "\
	openssh-sftp-server \
	vsftpd \
	lighttpd \
"

# Init tools
IMAGE_INSTALL += "\
	systemd-analyze \
"
