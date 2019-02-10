package com.sdi.beans;

public class BiCycle {
	private Chain chain;
	
	public void ride() {
		System.out.println("riding bicycle with chain : " + chain.getChainType());
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

}
