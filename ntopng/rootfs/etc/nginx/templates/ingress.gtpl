server {
    listen {{ .interface }}:{{ .port }} default_server;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;
    
    location /netflow {
        allow   172.30.32.2;
        deny    all;

        proxy_pass http://netflow;
    }

    location / {
        allow   172.30.32.2;
        deny    all;

        proxy_pass http://backend;
        
        #enable ntop in iframe
        proxy_hide_header X-Frame-Options;

        # enable substitution in all sources
        sub_filter_types *;
        # update prefix path
        sub_filter "/ntopng_prefix" "$http_x_ingress_path";
        sub_filter_once off;
    }
}
