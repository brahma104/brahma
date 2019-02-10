package com.srmt.partner.factory;

import com.lynk.partner.factory.PartnerServiceFactory;
import com.lynk.partner.service.MachineryPartnerService;
import com.lynk.partner.service.TransportPartnerService;
import com.srmt.partner.service.SRMTMachineryPartnerService;
import com.srmt.partner.service.SRMTTransportPartnerService;

public class SRMTPartnerServiceFactory extends PartnerServiceFactory {

	@Override
	protected TransportPartnerService createTransportPartnerService() {
		return new SRMTTransportPartnerService();
	}

	@Override
	protected MachineryPartnerService createMachineryPartnerService() {
		return new SRMTMachineryPartnerService();
	}

}
