package com.lynk.partner.service;

import java.util.Date;

public interface TransportPartnerService {
	String hire(String source, String destination, Date hireDate, String purpose, String person, String mobile,
			String emailAddress);
}
