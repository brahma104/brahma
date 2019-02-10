package org.lic.insurance.service;

import java.util.Date;
import java.util.UUID;

import javax.jws.WebService;

import org.lic.insurance.types.MemberCard;
import org.lic.insurance.types.MemberInfo;
import org.lic.insurance.types.PolicyInfo;

@WebService(endpointInterface = "org.lic.insurance.service.Insurance", serviceName = "InsuranceService", portName = "InsuranceSOAPPort")
public class InsuranceImpl {
	public MemberCard enroll(MemberInfo memberInfo, PolicyInfo policyInfo) {
		MemberCard mCard = null;
		mCard = new MemberCard();
		mCard.setEnrollmentNo(UUID.randomUUID().toString());
		mCard.setMemberName(memberInfo.getFirstName() + " "
				+ memberInfo.getLastName());
		mCard.setExpiryDate(new Date());
		return mCard;
	}

}
