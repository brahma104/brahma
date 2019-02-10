package com.nbf.beans;

public class Chain {
	private int chainNo;
	private String chainType;

	public void setChainNo(int chainNo) {
		this.chainNo = chainNo;
	}

	public void setChainType(String chainType) {
		this.chainType = chainType;
	}

	@Override
	public String toString() {
		return "Chain [chainNo=" + chainNo + ", chainType=" + chainType + "]";
	}

}
