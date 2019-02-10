package com.lynk.partner.factory;

import com.lynk.partner.service.MachineryPartnerService;
import com.lynk.partner.service.TransportPartnerService;

/**
 * Factory Method Design Pattern
 * 
 * @author Sriman
 *
 */
public abstract class PartnerServiceFactory {
	public TransportPartnerService newTransportPartnerService() {
		TransportPartnerService tps = null;
		tps = createTransportPartnerService();
		// apply some post creating process
		return tps;
	}

	public MachineryPartnerService newMachineryPartnerService() {
		MachineryPartnerService mps = null;

		mps = createMachineryPartnerService();
		// apply some post initialization process
		return mps;
	}

	// Should be implemented by sub-factories provided by vendors
	protected abstract TransportPartnerService createTransportPartnerService();

	protected abstract MachineryPartnerService createMachineryPartnerService();
}
