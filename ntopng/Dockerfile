# hadolint ignore=DL3006
ARG BUILD_FROM
FROM ${BUILD_FROM}

# Set shell
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# Setup base system
ARG BUILD_ARCH
ARG NDPI_VERSION
ARG NTOP_VERSION
ARG NETFLOW2NG_VERSION

COPY Makefile /tmp

# Install prerequisities
RUN sed -i -e's/ main/ main contrib/g' /etc/apt/sources.list.d/debian.sources \
    && apt-get update \
    && apt-get install -y --no-install-recommends \
    vim \
    build-essential \
    git \
    bison \
    flex \
    libtool \
    libtool-bin \
    autoconf \
    pkg-config \
    automake \
    autogen \
    rename \
    golang \
    librrd-dev \
    libxml2-dev \
    libpcap-dev \
    libsqlite3-dev \
    libhiredis-dev \
    libmariadb-dev \
    libmaxminddb-dev \
    libcurl4-openssl-dev \
    libpango1.0-dev \
    libcairo2-dev \
    libnetfilter-queue-dev \
    libssl-dev \
    libcap-dev \
    libnetfilter-conntrack-dev \
    libreadline-dev \
    libjson-c-dev \
    libldap2-dev \
    libsnmp-dev \
    libexpat1-dev \
    libsnmp-dev \
    libradcli-dev \
    libjson-c-dev \
    libzmq3-dev \
    zlib1g-dev \
    redis-server \
    geoipupdate \
    wget \
    rrdtool \
    nginx \
    procps \
    gir1.2-freedesktop \
    gir1.2-glib-2.0 \
    gir1.2-harfbuzz-0.0 \
    gir1.2-pango-1.0 \
    guile-3.0-libs \
    libcairo-gobject2 \
    libcairo-script-interpreter2 \
    libcurl4 \
    libfl2 \
    libgc1 \
    libgirepository-1.0-1 \
    libglib2.0-bin \
    libgssrpc4 \
    libharfbuzz-gobject0 \
    libharfbuzz-icu0 \
    libhiredis0.14 \
    libice6 \
    libjson-c5 \
    libkadm5clnt-mit12 \
    libkadm5srv-mit12 \
    libkdb5-10 \
    libltdl7 \
    liblzo2-2 \
    libmariadb3 \
    libmaxminddb0 \
    libncurses6 \
    libnetfilter-conntrack3 \
    libnetfilter-queue1 \
    libnetsnmptrapd40 \
    libnfnetlink0 \
    libopts25 \
    libpangoxft-1.0-0 \
    libpcap0.8 \
    libpcre2-16-0 \
    libpcre2-32-0 \
    libpcre2-posix3 \
    libradcli4 \
    libsensors-config \
    libsensors5 \
    libsm6 \
    libsnmp-base \
    libsnmp40 \
    libsqlite3-0 \
    libxft2 \
    libzmq5 \
# Build and install all software
    && cd /tmp \
    && git clone --depth 1 --branch ${NDPI_VERSION} https://github.com/ntop/nDPI.git nDPI \
    && git clone --depth 1 --branch ${NTOP_VERSION} https://github.com/ntop/ntopng.git ntopng \
    && git clone --depth 1 --branch ${NETFLOW2NG_VERSION} https://github.com/synfinatic/netflow2ng.git netflow2ng \
    && make -B -j8 \
    && cp ./netflow2ng/dist/netflow2ng-* /usr/local/bin/netflow2ng \
    && chmod +x /usr/local/bin/netflow2ng \
    && useradd -r -m -d /var/run/netflow -s /bin/false netflow \
    && useradd -r -m -d /var/run/ntop -s /bin/false ntopng \
# Cleanup
    && apt-get remove -y --purge \
    build-essential \
    git \
    bison \
    flex \
    libtool \
    libtool-bin \
    autoconf \
    pkg-config \
    automake \
    autogen \
    rename \
    librrd-dev \
    libxml2-dev \
    libpcap-dev \
    libsqlite3-dev \
    libhiredis-dev \
    libmaxminddb-dev \
    libcurl4-openssl-dev \
    libpango1.0-dev \
    libcairo2-dev \
    libnetfilter-queue-dev \
    libssl-dev \
    libcap-dev \
    libnetfilter-conntrack-dev \
    libreadline-dev \
    libjson-c-dev \
    libldap2-dev \
    libsnmp-dev \
    libexpat1-dev \
    libsnmp-dev \
    libradcli-dev \
    libjson-c-dev \
    libzmq3-dev \
    zlib1g-dev \
    && apt-get autoremove -y --purge \
    && rm -fr \
        /tmp/* \
        /etc/nginx \
        /etc/GeoIP.conf \
        /var/{cache,log}/* \
        /var/lib/apt/lists/*

# Copy root filesystem
COPY rootfs /
RUN chmod 775 /etc

# Build arguments
ARG BUILD_ARCH
ARG BUILD_DATE
ARG BUILD_DESCRIPTION
ARG BUILD_NAME
ARG BUILD_REF
ARG BUILD_REPOSITORY
ARG BUILD_VERSION

# Labels
LABEL \
    io.hass.name="${BUILD_NAME}" \
    io.hass.description="${BUILD_DESCRIPTION}" \
    io.hass.arch="${BUILD_ARCH}" \
    io.hass.type="addon" \
    io.hass.version=${BUILD_VERSION} \
    maintainer="Dominik Strnad <litinoveweedle@gmail.com>" \
    org.opencontainers.image.title="${BUILD_NAME}" \
    org.opencontainers.image.description="${BUILD_DESCRIPTION}" \
    org.opencontainers.image.authors="Dominik Strnad <litinoveweedle@gmail.com>" \
    org.opencontainers.image.licenses="Apache 2.0" \
    org.opencontainers.image.url="https://github.com/${BUILD_REPOSITORY}" \
    org.opencontainers.image.source="https://github.com/${BUILD_REPOSITORY}" \
    org.opencontainers.image.documentation="https://github.com/${BUILD_REPOSITORY}/blob/main/README.md" \
    org.opencontainers.image.created=${BUILD_DATE} \
    org.opencontainers.image.revision=${BUILD_REF} \
    org.opencontainers.image.version=${BUILD_VERSION}
