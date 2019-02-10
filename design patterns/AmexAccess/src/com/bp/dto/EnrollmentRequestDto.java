package com.bp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class EnrollmentRequestDto implements Serializable {
	private static final long serialVersionUID = -1502166880288785521L;
	protected String firstName;
	protected String lastName;
	protected String gender;
	protected Date dob;
	protected String mobileNo;
	protected String emailAddress;
	protected String planNo;
	protected int tenure;
	protected double sumInsurred;
	protected List<MedicalRecordDto> medicalRecords;

	public EnrollmentRequestDto() {
		super();
	}

	public EnrollmentRequestDto(String firstName, String lastName, String gender, Date dob, String mobileNo,
			String emailAddress, String planNo, int tenure, double sumInsurred) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
		this.planNo = planNo;
		this.tenure = tenure;
		this.sumInsurred = sumInsurred;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPlanNo() {
		return planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getSumInsurred() {
		return sumInsurred;
	}

	public void setSumInsurred(double sumInsurred) {
		this.sumInsurred = sumInsurred;
	}

	public List<MedicalRecordDto> getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(List<MedicalRecordDto> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

}
