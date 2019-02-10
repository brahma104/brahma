package com.sdi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BiCycle {
	@Autowired
	private Chain chain;

	public void ride() {
		System.out.println("riding bicycle with chain : " + chain.getChainType());
	}

}
