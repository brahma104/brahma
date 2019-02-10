package com.annon.req;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int robotNo;
	private String robotType;

	@Required
	public void setRobotNo(int robotNo) {
		this.robotNo = robotNo;
	}

	public void setRobotType(String robotType) {
		this.robotType = robotType;
	}

	@Override
	public String toString() {
		return "Robot [robotNo=" + robotNo + ", robotType=" + robotType + "]";
	}

}
