package org.lic.insurance.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.lic.insurance.types.MemberCard;
import org.lic.insurance.types.MemberInfo;
import org.lic.insurance.types.PolicyInfo;

@WebService(targetNamespace = "http://lic.org/insurance/service", name = "insurance")
public interface Insurance {
	@WebMethod(action = "http://lic.org/insurance/service#enroll")
	@WebResult(targetNamespace = "http://lic.org/insurance/types", name = "memberCard")
	MemberCard enroll(
			@WebParam(targetNamespace = "http://lic.org/insurance/types", name = "memberInfo") MemberInfo memberInfo,
			@WebParam(targetNamespace = "http://lic.org/insurance/types", name = "policyInfo") PolicyInfo policyInfo);
}







