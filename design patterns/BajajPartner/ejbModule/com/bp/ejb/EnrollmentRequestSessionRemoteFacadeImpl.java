package com.bp.ejb;

import java.rmi.RemoteException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.bp.bo.ApplicantBo;
import com.bp.bo.EnrollmentBo;
import com.bp.bo.MedicalRecordBo;
import com.bp.dto.EnrollmentRequestDto;
import com.bp.dto.MedicalRecordDto;
import com.bp.service.EnrollmentService;
import com.bp.service.ManageApplicantService;
import com.bp.service.ManageMedicalRecordMaintainanceService;

@Stateless(mappedName = "enrollmentRequestSessionFacade")
@LocalBean
public class EnrollmentRequestSessionRemoteFacadeImpl implements EnrollmentRequestSessionRemoteFacade {

	@Override
	public String newEnrollmentRequest(EnrollmentRequestDto enrollmentRequest) {
		ApplicantBo applicant = null;
		String applicantNo = null;
		MedicalRecordBo medicalRecordBo = null;
		EnrollmentBo enrollmentBo = null;
		EnrollmentService enrollmentService = null;
		ManageApplicantService manageApplicantService = null;
		ManageMedicalRecordMaintainanceService manageMedicalRecordMaintainanceService = null;

		applicant = new ApplicantBo(enrollmentRequest.getFirstName(), enrollmentRequest.getLastName(),
				enrollmentRequest.getGender(), enrollmentRequest.getDob(), enrollmentRequest.getMobileNo(),
				enrollmentRequest.getEmailAddress());
		manageApplicantService = new ManageApplicantService();
		applicantNo = manageApplicantService.newApplication(applicant);

		manageMedicalRecordMaintainanceService = new ManageMedicalRecordMaintainanceService();
		for (MedicalRecordDto dto : enrollmentRequest.getMedicalRecords()) {
			medicalRecordBo = new MedicalRecordBo(applicantNo, dto.getMedicalTestName(), dto.getMedicalRecordDate(),
					dto.getDescription(), dto.getResult());
			manageMedicalRecordMaintainanceService.addMedicalRecord(medicalRecordBo);
		}
		enrollmentBo = new EnrollmentBo(applicantNo, enrollmentRequest.getPlanNo(), enrollmentRequest.getTenure(),
				enrollmentRequest.getSumInsurred());
		enrollmentService = new EnrollmentService();
		String applicationNo = enrollmentService.newEnrollmentRequest(enrollmentBo);

		return applicationNo;
	}

}
