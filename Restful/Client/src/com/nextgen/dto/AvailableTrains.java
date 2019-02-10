package com.nextgen.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "availableTrains")
public class AvailableTrains {
	@XmlElement(name = "trainNo")
	private List<String> trains;

	public List<String> getTrains() {
		return trains;
	}

	public void setTrains(List<String> trains) {
		this.trains = trains;
	}

	@Override
	public String toString() {
		return "AvailableTrains [trains=" + trains + "]";
	}

}
