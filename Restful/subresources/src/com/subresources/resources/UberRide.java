package com.subresources.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/uber")
public class UberRide {

	@Path("/ride")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public float tripEstimator(@QueryParam("source") String source, @QueryParam("destination") String destination) {
		return 39.34f;
	}

	@Path("/pool")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public float poolTripEstimator(@QueryParam("source") String source, @QueryParam("destination") String destination,
			@QueryParam("persons") int persons) {
		return (float) (39.45 * persons);
	}
}
