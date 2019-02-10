package com.otm.bo;

public class Flat {
	private String flatType;
	private String facing;
	private int sqft;

	public Flat(String flatType, String facing, int sqft) {
		super();
		this.flatType = flatType;
		this.facing = facing;
		this.sqft = sqft;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public int getSqft() {
		return sqft;
	}

	public void setSqft(int sqft) {
		this.sqft = sqft;
	}

	@Override
	public String toString() {
		return "Flat [flatType=" + flatType + ", facing=" + facing + ", sqft=" + sqft + "]";
	}

}
