package com.bp.service;

import java.util.Random;

import com.bp.bo.EnrollmentBo;

public class EnrollmentService {
	public String newEnrollmentRequest(EnrollmentBo bo) {
		return "a:" + bo.getApplicantNo() + new Random().nextInt() + ":R";
	}
}
