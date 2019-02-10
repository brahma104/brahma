package com.annon.stereotype;

import javax.inject.Named;

import org.springframework.stereotype.Controller;

//@Controller("ranger")
@Named("ranger")
public class BiCycle {

	public BiCycle() {
		System.out.println("biCycle() created");
	}

	public void ride() {
		System.out.println("riding...");
	}
}
