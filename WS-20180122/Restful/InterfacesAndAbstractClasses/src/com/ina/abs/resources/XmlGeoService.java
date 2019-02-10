package com.ina.abs.resources;

import javax.ws.rs.Path;

@Path("/xml/geographic")
public class XmlGeoService extends AbstractGeoService {
	public String transformAddress(Address address) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		buffer.append("<address><streetAddress>").append(address.getStreetAddress()).append("</streetAddress><city>")
				.append(address.getCity()).append("</city><zip>").append(address.getZip()).append("</zip><country>")
				.append(address.getCountry()).append("</country></address>");
		return buffer.toString();
	}
}
