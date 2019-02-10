package com.ashoka.partner.factory;

import com.ashoka.partner.service.AshokaMachineryPartnerService;
import com.ashoka.partner.service.AshokaTransportPartnerService;
import com.lynk.partner.factory.PartnerServiceFactory;
import com.lynk.partner.service.MachineryPartnerService;
import com.lynk.partner.service.TransportPartnerService;

public class AshokaPartnerServiceFactory extends PartnerServiceFactory {

	@Override
	protected TransportPartnerService createTransportPartnerService() {
		return new AshokaTransportPartnerService();
	}

	@Override
	protected MachineryPartnerService createMachineryPartnerService() {
		return new AshokaMachineryPartnerService();
	}

}
