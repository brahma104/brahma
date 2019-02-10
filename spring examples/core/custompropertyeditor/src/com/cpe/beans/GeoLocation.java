package com.cpe.beans;

public class GeoLocation {
	private int xCoordinate;
	private int yCoordinate;

	public GeoLocation(int xCoordinate, int yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	@Override
	public String toString() {
		return "GeoLocation [xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + "]";
	}

}
