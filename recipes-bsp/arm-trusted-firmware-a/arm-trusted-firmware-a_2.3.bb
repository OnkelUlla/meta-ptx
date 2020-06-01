# This recipe can be used as a template for individual trusted firmware recipes.
# To do so, please remove this comment and the following line which fakes the
# MACHINE to "none" to avoid parse errors in the context of this template. Then
# fill in sensible values for the addressed variables in the other comments to
# overwrite the include file's defaults and, of course, uncomment those lines.
# Build time configuration is done via make variables which are fed into the
# recipe by an additional include file "files/<MACHINE>/defconfig.inc". Finally,
# if needed, add an individual patchstack under files/patches and announce the
# individual patches to bitbake via the SRC_URI variable.
MACHINE="none"
require recipes-bsp/arm-trusted-firmware-a/arm-trusted-firmware-a.inc

# SUMMARY = "ARM Trusted Firmware-A for <SoC/platform>"

SRC_URI[md5sum] = "0765d874e3a6575e335f02cb41efc3dc"
SRC_URI[sha256sum] = "21e0347dbf45698df9d94aee62b9462d2b8b455b1d7a934517fa56a266b38602"

# COMPATIBLE_MACHINE = "none"
# PLATFORM = "none"
