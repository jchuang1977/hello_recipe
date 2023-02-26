DESCRIPTION = "bb file for hello.c"
LICENSE = "CLOSED"
SRC_URI = "file://hello.c \
"
S = "${WORKDIR}"

do_compile() {
   cd ${S}
   ${CC} ${LDFLAGS} hello.c -o helloworld
}
do_install() {
   install -d ${D}${bindir}
   install -m 777 ${S}/helloworld ${D}${bindir}
}
#INSANE_SKIP = "ldflags"
