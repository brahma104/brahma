package com.rc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "trainStatus")
public class TrainStatus {
	protected int trainNo;
	protected String trainName;
	protected String leftStation;
	protected String nextStation;

	public TrainStatus() {
	}

	public TrainStatus(int trainNo, String trainName, String leftStation, String nextStation) {
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.leftStation = leftStation;
		this.nextStation = nextStation;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getLeftStation() {
		return leftStation;
	}

	public void setLeftStation(String leftStation) {
		this.leftStation = leftStation;
	}

	public String getNextStation() {
		return nextStation;
	}

	public void setNextStation(String nextStation) {
		this.nextStation = nextStation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leftStation == null) ? 0 : leftStation.hashCode());
		result = prime * result + ((nextStation == null) ? 0 : nextStation.hashCode());
		result = prime * result + ((trainName == null) ? 0 : trainName.hashCode());
		result = prime * result + trainNo;
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
		TrainStatus other = (TrainStatus) obj;
		if (leftStation == null) {
			if (other.leftStation != null)
				return false;
		} else if (!leftStation.equals(other.leftStation))
			return false;
		if (nextStation == null) {
			if (other.nextStation != null)
				return false;
		} else if (!nextStation.equals(other.nextStation))
			return false;
		if (trainName == null) {
			if (other.trainName != null)
				return false;
		} else if (!trainName.equals(other.trainName))
			return false;
		if (trainNo != other.trainNo)
			return false;
		return true;
	}

}
