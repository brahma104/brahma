package com.lmi.beans;

public class RequestHandler {
	private String data;

	public void setData(String data) {
		this.data = data;
	}

	public void process() {
		System.out.println("processing with agent :" + this.hashCode() + " using data :" + data);
	}
}
