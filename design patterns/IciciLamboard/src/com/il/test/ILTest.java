package com.il.test;

import com.il.insurance.builder.AutomobileInsuranceServiceBuilder;
import com.il.insurance.builder.TwoWheelerInsuranceServiceBuilder;
import com.il.insurance.service.AutomobileInsuranceService;

public class ILTest {

	public static void main(String[] args) {
		AutomobileInsuranceService automobileInsuranceService = null;
		AutomobileInsuranceServiceBuilder builder = null;

		builder = AutomobileInsuranceService.newBuilder("twoWheeler", "Pulsar", "Bajaj", 2009, "ch03930", "en0393",
				"petrol");
		((TwoWheelerInsuranceServiceBuilder)builder).engineType("4 Stroke");
		automobileInsuranceService = builder.build();
		System.out.println(automobileInsuranceService);

	}

}















