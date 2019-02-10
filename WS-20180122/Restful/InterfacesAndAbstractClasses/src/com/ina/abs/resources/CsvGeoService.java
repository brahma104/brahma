package com.ina.abs.resources;

import javax.ws.rs.Path;

@Path("/csv/geographic")
public class CsvGeoService extends AbstractGeoService {

	public String transformAddress(Address address) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		buffer.append("streetAddress=").append(address.getStreetAddress()).append(",city=").append(address.getCity())
				.append(",zip=").append(address.getZip()).append(",country=").append(address.getCountry());
		return buffer.toString();
	}
}
