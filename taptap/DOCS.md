# Home Assistant Add-on: TapTap - Tigo CCA to MQTT

## How to use

- requires MQTT server (you can use Home Assistant Mosquitto broker addon)
- requires configured Home Assistant MQTT integration
- requires Modbus to Ethernet convertor (optionaly Modbus to USB/Serial dongle)
    - set Modbus communication to 38400b, databits 8, stopbits 1, Flow control None
    - set convertor mode to Modbus TCP Server    
    - remember IP address and TCp port of converter to set in the addon configuration later
- Modbus convertor has to connected to Tigo CCA gateway
  - connect convertor to connector named Gateway on Tigo CCA gateway
  - there will be already wires in this connector from the connected Tigo Tap
  - connect convertor together with existing wires from Tigo Tap
  - use 3 wires - A, B and Ground, connect A to A, B to B, Groud to Ground
  - wires shall be as short as possible - mount your convertor close to the Tigo CCA gateway
