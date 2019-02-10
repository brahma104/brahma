package com.srmt.partner.service;

import java.util.UUID;

import com.lynk.partner.service.MachineryPartnerService;

public class SRMTMachineryPartnerService implements MachineryPartnerService {

	@Override
	public String hire(String area, String machineryType, int hours, String person, String mobile,
			String emailAddress) {
		return "SRMTMPS-" + UUID.randomUUID().toString();
	}

}
