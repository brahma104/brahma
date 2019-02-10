package com.tm.bo;

public class EducationDetails {
	protected String highestDegreeName;
	protected String degreeType;
	protected int yearOfPassing;
	protected String universityName;

	public EducationDetails(String highestDegreeName, String degreeType, int yearOfPassing, String universityName) {
		super();
		this.highestDegreeName = highestDegreeName;
		this.degreeType = degreeType;
		this.yearOfPassing = yearOfPassing;
		this.universityName = universityName;
	}

	public String getHighestDegreeName() {
		return highestDegreeName;
	}

	public void setHighestDegreeName(String highestDegreeName) {
		this.highestDegreeName = highestDegreeName;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

}
