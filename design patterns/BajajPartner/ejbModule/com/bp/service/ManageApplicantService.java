package com.bp.service;

import java.util.Random;

import com.bp.bo.ApplicantBo;

public class ManageApplicantService {
	public String newApplication(ApplicantBo applicantBo) {
		return applicantBo.getFirstName() + ":" + new Random().nextInt();
	}
}
