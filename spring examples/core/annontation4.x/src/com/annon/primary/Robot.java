package com.annon.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private Chip chip;

	public void start() {
		chip.boot();
	}

	@Autowired
	public void setChip(Chip chip) {
		this.chip = chip;
	}

}
