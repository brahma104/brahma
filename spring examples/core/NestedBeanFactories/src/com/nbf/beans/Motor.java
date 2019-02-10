package com.nbf.beans;

public class Motor {
	private Chain chain;

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Motor [chain=" + chain + "]";
	}

}
