package com.co.entities;

import java.io.Serializable;
import java.util.Set;

public class Bus implements Serializable {
	protected int busNo;
	protected String busType;
	
	protected Set<Trip> trips;

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public Set<Trip> getTrips() {
		return trips;
	}

	public void setTrips(Set<Trip> trips) {
		this.trips = trips;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + busNo;
		result = prime * result + ((busType == null) ? 0 : busType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (busNo != other.busNo)
			return false;
		if (busType == null) {
			if (other.busType != null)
				return false;
		} else if (!busType.equals(other.busType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busType=" + busType + "]";
	}

}
