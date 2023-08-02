ntop: netflow2ng ndpi
	cd ntopng && ./autogen.sh && ./configure && make && make install #-j48

ndpi:
	cd nDPI && ./autogen.sh --with-only-libndpi && ./configure && make #-j48

netflow2ng:
	cd netflow2ng && make -B #netflow

all: ntop
	echo "Done"
