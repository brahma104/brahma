package com.cc.beans;

import java.beans.ConstructorProperties;

public class Project {
	private int projectNo;
	private String title;
	private double budget;

	@ConstructorProperties({ "projectNo", "title" })
	public Project(int projectNo, String title) {
		this.projectNo = projectNo;
		this.title = title;
	}

	@ConstructorProperties({ "projectNo", "budget" })
	public Project(int projectNo, double budget) {
		this.projectNo = projectNo;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", title=" + title + ", budget=" + budget + "]";
	}

}
