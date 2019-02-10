package com.lynk.partner.factory;

import java.io.IOException;
import java.util.Properties;

/**
 * AbstractFactory Design Pattern
 * 
 * @author Sriman
 *
 */
public class LynkServiceFactory {
	private static Properties partnerProperties;

	static {
		try {
			partnerProperties = new Properties();
			partnerProperties
					.load(LynkServiceFactory.class.getClassLoader().getResourceAsStream("partners.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static PartnerServiceFactory newPartnerServiceFactory(String partner) throws Exception {
		String partnerServiceFactoryClass = null;
		PartnerServiceFactory partnerServiceFactory = null;

		partnerServiceFactoryClass = partnerProperties.getProperty(partner);
		if (partnerServiceFactoryClass == null) {
			throw new Exception("partner not found");
		}
		partnerServiceFactory = (PartnerServiceFactory) Class.forName(partnerServiceFactoryClass).newInstance();
		return partnerServiceFactory;
	}
}
