package com.bp.ejb;

import javax.ejb.Remote;

import com.bp.dto.EnrollmentRequestDto;

@Remote
public interface EnrollmentRequestSessionRemoteFacade {
	String newEnrollmentRequest(EnrollmentRequestDto enrollmentRequest);
}
