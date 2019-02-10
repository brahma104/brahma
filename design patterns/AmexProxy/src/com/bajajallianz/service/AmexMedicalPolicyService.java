package com.bajajallianz.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bajajallianz.dto.PolicyDto;

public class AmexMedicalPolicyService implements MedicalPolicyService {
	private MedicalPolicyService medicalPolicySerivce;

	public AmexMedicalPolicyService(MedicalPolicyService medicalPolicySerivce) {
		this.medicalPolicySerivce = medicalPolicySerivce;
	}

	@Override
	public List<PolicyDto> getPolicies() throws SQLException {
		List<PolicyDto> amexPolicies = null;
		List<PolicyDto> policies = null;

		amexPolicies = new ArrayList<>();
		policies = medicalPolicySerivce.getPolicies();
		for (PolicyDto policy : policies) {
			if (policy.getProviderId().equals("amex")) {
				amexPolicies.add(policy);
			}
		}

		return amexPolicies;
	}

}
