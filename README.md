# This repository deprecated and all addons are not anymore maintained

Open Home Foundation in 'bright' decision killed HomeAssistant Supervised. I used it for long time even after that as gone as it was the sweet spot for me. Unfortunately OHF enshitification of HA towards user not running HassIO continued into the stage, where I had two options. Install HassIO on VM or start running HA in Docker. As I consider HassIO to be inferior to my OS from any point of view (i.e. maintainability, flexibility, security...) I finally decided to switch my HA to Docker. Therefore I have no motivation and needs to keep this HassIO addons repo going.

'So long, and thanks for all the fish'


# Li Tin O've Weedle custom Home Assistant add-on repository

The stuff I think I need or just want and  can't find somewhere else. ;-)

[![Open your Home Assistant instance and show the add add-on repository dialog with a specific repository URL pre-filled.](https://my.home-assistant.io/badges/supervisor_add_addon_repository.svg)](https://my.home-assistant.io/redirect/supervisor_add_addon_repository/?repository_url=https%3A%2F%2Fgithub.com%2Flitinoveweedle%2Fhassio-addons)

## Add-on documentation

Each addons comes with own DOCS.md documenting functions and configuration. Find it either browsing this repo source or after addon installation in the Home Assistant addon page in the tab Documentation.

## Issues

To report issues please use [Github Issues in the development repo](https://github.com/litinoveweedle/hassio-addons-dev/issues).

## Add-ons

This repository contains the following add-ons

### [ntopng](./ntopng)

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]

Opensource community version of ntopng with free netflow collector implementation netflow2ng

### [taptap](./taptap)

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]

Tigo CCA Tap to MQTT implementation to get data from Tigo optimizers locally to Home Assistant



[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
