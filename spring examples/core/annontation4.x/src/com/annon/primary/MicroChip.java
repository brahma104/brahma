package com.annon.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MicroChip implements Chip {

	@Override
	public void boot() {
		System.out.println("Microchip booted");
	}

}
