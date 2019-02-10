package com.amexaccess.delegate;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.amexaccess.locator.EnrollmentRequestServiceLocator;
import com.amexaccess.vo.EnrollmentRequestVo;
import com.bp.dto.EnrollmentRequestDto;
import com.bp.dto.MedicalRecordDto;
import com.bp.ejb.EnrollmentRequestSessionRemoteFacade;

public class EnrollmentDelegate {

	public String newEnrollmentRequest(EnrollmentRequestVo vo) throws Exception {
		EnrollmentRequestSessionRemoteFacade enrollmentRequestSessionRemote = null;
		EnrollmentRequestServiceLocator enrollmentRequestServiceLocator = null;
		EnrollmentRequestDto enrollmentRequestDto = null;
		List<MedicalRecordDto> medicalRecords = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String applicationNo = null;

		try {
			enrollmentRequestDto = new EnrollmentRequestDto(vo.getFirstName(), vo.getLastName(), vo.getGender(),
					sdf.parse(vo.getDob()), vo.getMobileNo(), vo.getEmailAddress(), vo.getPlanNo(),
					Integer.parseInt(vo.getTenure()), Double.parseDouble(vo.getSumInsurred()));

			medicalRecords = new ArrayList<>();
			medicalRecords.add(new MedicalRecordDto(vo.getMedicalTestName(), sdf.parse(vo.getMedicalRecordDate()),
					vo.getDescription(), vo.getMedicalTestResult()));

			enrollmentRequestDto.setMedicalRecords(medicalRecords);
			enrollmentRequestServiceLocator = new EnrollmentRequestServiceLocator();
			enrollmentRequestSessionRemote = enrollmentRequestServiceLocator.lookupEnrollmentRequestService();
			applicationNo = enrollmentRequestSessionRemote.newEnrollmentRequest(enrollmentRequestDto);

		} catch (NumberFormatException | ParseException | NamingException e) {
			throw e;
		}
		return applicationNo;
	}
}
