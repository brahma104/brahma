package com.cw.resources;

import java.util.Calendar;
import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cw.dto.Address;

@Path("/geo")
public class GeoService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/address/{lat}/{lng}")
	public Response getAddress(@PathParam("lat") double lat, @PathParam("lng") double lng) {
		Response response = null;
		Address address = null;
		Calendar calendar = null;
		System.out.println("getAddress()");
		address = new Address("park street", "hyderabad", "telangana", "India");
		calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.set(Calendar.HOUR, 21);
		response = Response.ok(address).expires(calendar.getTime()).build();

		return response;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/coordinates/{streetAddress}/{city}")
	public Response getCoordinates(@PathParam("streetAddress") String streetAddress, @PathParam("city") String city,
			@QueryParam("state") String state) {
		String coordinates = null;
		Response response = null;
		CacheControl cacheControl = null;

		System.out.println("getCoordinates()");

		if (streetAddress.equals("park street")) {
			coordinates = "78.3:03.34";
		} else if (streetAddress.equals("court street")) {
			coordinates = "64.3:06.46";
		}

		cacheControl = new CacheControl();
		cacheControl.setMaxAge(1000 * 60 * 5);
		response = Response.ok(coordinates).cacheControl(cacheControl).build();
		return response;
	}

}
