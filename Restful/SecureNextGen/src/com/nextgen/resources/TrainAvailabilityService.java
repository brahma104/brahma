package com.nextgen.resources;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.nextgen.dto.AvailableTrains;

@Path("/train/availability")
public class TrainAvailabilityService {

	@RolesAllowed({ "moderator", "admin" })
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/between/{source}/{destination}")
	public AvailableTrains getTrainsBetweenStations(@PathParam("source") String source,
			@PathParam("destination") String destination, @Context SecurityContext securityContext) {
		AvailableTrains availableTrains = null;
		List<String> trains = null;

		trains = new ArrayList<>();
		trains.add("t9283");
		trains.add("t343");
		trains.add("t575");
		trains.add("trsp283");
		if (securityContext.isUserInRole("admin")) {
			trains.add("tc93");
			trains.add("tc038");
		}
		availableTrains = new AvailableTrains();
		availableTrains.setTrains(trains);

		return availableTrains;
	}
}
