package com.bajajallianz.util;

import com.bajajallianz.service.AmexMedicalPolicyService;
import com.bajajallianz.service.MedicalPolicyService;
import com.bajajallianz.service.MedicalPolicyServiceImpl;

public class MedicalPolicyServiceFactory {
	public static MedicalPolicyService getMedicalPolicyService(String provider) {
		MedicalPolicyService medicalPolicyService = null;

		if (provider.equals("amex")) {
			medicalPolicyService = new AmexMedicalPolicyService(new MedicalPolicyServiceImpl());
		} else {
			medicalPolicyService = new MedicalPolicyServiceImpl();
		}
		return medicalPolicyService;
	}
}
