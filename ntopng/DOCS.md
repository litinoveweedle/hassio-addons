# Li Tin O`ve Weedle Assistant Add-on: ntopng

This is an ntopng add-on for Home Assistant.
It includes opensource community version of ntopng
and opensource netflow collector implementation netflow2ng


## Installation

Install ntopng addon in your Home Assistant

1. Click the Home Assistant My button below to open the add-on on your Home
   Assistant instance.

   [![Open this add-on in your Home Assistant instance.][addon-badge]][addon]

2. Click the "Install" button to install the add-on.
3. Start the "Example" add-on.
4. Check the logs of the "Example" add-on to see it in action.


## Configuration

ntopng add-on configuration:

```yaml
log_level: info
ssl: true
certfile: certfile.pem
keyfile: keyfile.pem
leave_front_door_open: false
ntop_auth: false
custom_scripts: false
dns_mode: 1
local_net:
  - 192.168.1.0/24
  - 192.168.30.0/22
export_flows: mysql;127.0.0.1;ntopng;user;secret_password
geoip_account_id: 123456
geoip_license_key: "Kdsalhdsl_lshahc_hskljd_as"
```

### Option: `log_level`

The `log_level` option controls the level of log output by the add-on and can
be changed to be more or less verbose, which might be useful when you are
dealing with an unknown issue. Possible values are:

- `trace`: Show every detail, like all called internal functions.
- `debug`: Shows detailed debug information.
- `info`: Normal (usually) interesting events.
- `warning`: Exceptional occurrences that are not errors.
- `error`: Runtime errors that do not require immediate action.
- `fatal`: Something went terribly wrong. Add-on becomes unusable.

Please note that each level automatically includes log messages from a
more severe level, e.g., `debug` also shows `info` messages. By default,
the `log_level` is set to `info`, which is the recommended setting unless
you are troubleshooting.

### Option: `ssl`

### Option: `certfile`

### Option: `keyfile`

### Option: `leave_front_door_open`

### Option: `ntop_auth`

### Option: `custom_scripts`

### Option: `dns_mode`

### Option: `loacl_net`

### Option: `export_flows`

### Option: `geoip_account_id`

### Option: `geoip_license_key`

## Changelog & Releases

This repository keeps a change log using [GitHub's releases][releases]
functionality.

Releases are based on [Semantic Versioning][semver], and use the format
of `MAJOR.MINOR.PATCH`. In a nutshell, the version will be incremented
based on the following:

- `MAJOR`: Incompatible or major changes.
- `MINOR`: Backwards-compatible new features and enhancements.
- `PATCH`: Backwards-compatible bugfixes and package updates.


## Support

Got questions?

You have several options to get them answered:

- The Home Assistant [Community Forum][forum].
- You could also [open an issue here][issue] GitHub.

You could also [open an issue here][issue] GitHub.


## Authors & contributors

The original setup of this repository is by [Li Tin O`ve Weedle][litin].


## License

Apache 2.0

Copyright (c) 2023 Dominik Strnad

[addon-badge]: https://my.home-assistant.io/badges/supervisor_addon.svg
[addon]: https://my.home-assistant.io/redirect/supervisor_addon/?addon=a0d7b954_example&repository_url=https%3A%2F%2Fgithub.com%2Flitinoveweedle%2Fhassio-addons
[contributors]: https://github.com/litinoveweedle/hassio-addons/graphs/contributors
[forum]: https://community.home-assistant.io/t/foss-ntopng-with-netflow-collector-hassio-addon/603491
[litin]: https://github.com/litinoveweedle
[issue]: https://github.com/litinoveweedle/hassio-addons-dev/issues
[semver]: http://semver.org/spec/v2.0.0.html
