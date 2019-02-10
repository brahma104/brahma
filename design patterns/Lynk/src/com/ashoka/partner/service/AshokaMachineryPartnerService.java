package com.ashoka.partner.service;

import java.util.UUID;

import com.lynk.partner.service.MachineryPartnerService;

public class AshokaMachineryPartnerService implements MachineryPartnerService {

	@Override
	public String hire(String area, String machineryType, int hours, String person, String mobile,
			String emailAddress) {
		return "ASKMPS-" + UUID.randomUUID().toString();
	}

}
