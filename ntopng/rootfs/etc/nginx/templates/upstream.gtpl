upstream backend {
    server 127.0.0.1:{{ .ntopng_port }};
}

upstream netflow {
    server 127.0.0.1:{{ .netflow2ng_port }};
}
