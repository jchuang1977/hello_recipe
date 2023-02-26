FILESEXTRAPATHS_prepend := "${THISDIR}/:"
SRC_URI += "file://abc.cpp"

do_compile_append(){
	${CXX} ${LDFLAGS} abc.cpp -o abc
}

do_install_append(){
	install -m 777 ${S}/abc ${D}${bindir}
}
