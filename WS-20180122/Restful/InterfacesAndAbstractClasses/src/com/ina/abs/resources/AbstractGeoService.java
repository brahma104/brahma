package com.ina.abs.resources;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

public abstract class AbstractGeoService {
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN })
	public StreamingOutput getAddress(@QueryParam("lat") double lat, @QueryParam("lng") double lng) {
		Address address = null;
		String sAddress = null;
		// goto database with lat and lng
		address = new Address();
		address.setStreetAddress("Ameerpet X Roads");
		address.setCity("hyderabad");
		address.setZip(3939);
		address.setCountry("India");

		sAddress = transformAddress(address);
		return new AddressStreamingOuput(sAddress);
	}

	private final class AddressStreamingOuput implements StreamingOutput {
		private String address;

		public AddressStreamingOuput(String address) {
			this.address = address;
		}

		@Override
		public void write(OutputStream os) throws IOException, WebApplicationException {
			os.write(address.getBytes());
			os.close();
		}

	}

	abstract protected String transformAddress(Address address);
}
