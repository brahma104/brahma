package com.ina.it.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/geographic")
public interface GeoService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String getArea(@QueryParam("lat") double lat, @QueryParam("lng") double lng);
}
