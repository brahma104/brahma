package com.annon.primary;

import org.springframework.stereotype.Component;

@Component
public class NanoChip implements Chip {

	@Override
	public void boot() {
		System.out.println("Nano chip booted");
	}

}
