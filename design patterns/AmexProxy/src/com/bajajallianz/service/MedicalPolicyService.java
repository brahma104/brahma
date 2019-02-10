package com.bajajallianz.service;

import java.sql.SQLException;
import java.util.List;

import com.bajajallianz.dto.PolicyDto;

public interface MedicalPolicyService {
	List<PolicyDto> getPolicies() throws SQLException;
}
