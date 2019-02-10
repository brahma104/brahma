package com.bajajallianz.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bajajallianz.bo.MedicalPolicy;
import com.bajajallianz.dao.PolicyDao;
import com.bajajallianz.dto.PolicyDto;

public class MedicalPolicyServiceImpl implements MedicalPolicyService {

	@Override
	public List<PolicyDto> getPolicies() throws SQLException {
		PolicyDao policyDao = null;
		List<MedicalPolicy> medicalPolicies = null;
		List<PolicyDto> policies = null;

		policyDao = new PolicyDao();
		policies = new ArrayList<>();
		medicalPolicies = policyDao.getAllPolicies();
		for (MedicalPolicy mp : medicalPolicies) {
			policies.add(new PolicyDto(mp.getPolicyNo(), mp.getPolicyName(), mp.getPolicyType(), mp.getMinTenure(),
					mp.getMaxTenure(), mp.getPremiumAmount(), mp.getProviderId()));
		}

		return policies;
	}

}
