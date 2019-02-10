package com.annon.autowire;

import javax.annotation.Resource;

public class Robot {
	@Resource(name = "chip1")
	private Chip chip;

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
