package com.dc.beans;

/**
 * @author Sriman
 *
 */
public class House {
	private String houseNo;
	private String area;
	private int sqYards;
	private Owner owner;

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setSqYards(int sqYards) {
		this.sqYards = sqYards;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "House [houseNo=" + houseNo + ", area=" + area + ", sqYards=" + sqYards + ", owner=" + owner + "]";
	}

}
