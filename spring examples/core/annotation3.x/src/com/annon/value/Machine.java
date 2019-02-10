package com.annon.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Machine {
	private int machineNo;
	private String manufacturer;

	@Value("#{appValues.Machine_machineNo}")
	public void setMachineNo(int machineNo) {
		this.machineNo = machineNo;
	}

	@Value("#{appValues.Machine_manufacturer}")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Machine [machineNo=" + machineNo + ", manufacturer=" + manufacturer + "]";
	}

}
