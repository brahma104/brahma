package com.bp.bo;

import java.util.Date;

public class MedicalRecordBo {
	protected String applicantNo;
	protected String medicalTestName;
	protected Date medicalRecordDate;
	protected String description;
	protected String result;

	public MedicalRecordBo(String applicantNo, String medicalTestName, Date medicalRecordDate, String description,
			String result) {
		this.applicantNo = applicantNo;
		this.medicalTestName = medicalTestName;
		this.medicalRecordDate = medicalRecordDate;
		this.description = description;
		this.result = result;
	}

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public String getMedicalTestName() {
		return medicalTestName;
	}

	public void setMedicalTestName(String medicalTestName) {
		this.medicalTestName = medicalTestName;
	}

	public Date getMedicalRecordDate() {
		return medicalRecordDate;
	}

	public void setMedicalRecordDate(Date medicalRecordDate) {
		this.medicalRecordDate = medicalRecordDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
