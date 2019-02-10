package com.ib.beans;

public class Chain {
	private int chainNo;
	private String chainType;
	private int length;

	public void setChainNo(int chainNo) {
		this.chainNo = chainNo;
	}

	public void setChainType(String chainType) {
		this.chainType = chainType;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Chain [chainNo=" + chainNo + ", chainType=" + chainType + ", length=" + length + "]";
	}

}
