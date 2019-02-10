package com.rc.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.rc.dto.TrainStatus;

@Path("/rail")
public class RailService {
	private Map<String, TrainStatus> railDb;

	public RailService() {
		railDb = new HashMap<>();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/status/{trainNo}/{day}")
	public Response runningStatus(@PathParam("trainNo") int trainNo, @PathParam("day") int day,
			@Context Request request) {
		String id = null;
		String sETag = null;
		CacheControl cc = null;
		Response response = null;
		TrainStatus trainStatus = null;

		// first get the server data
		id = trainNo + ":" + day;
		trainStatus = railDb.get(id);
		sETag = String.valueOf(trainStatus.hashCode());
		ResponseBuilder builder = request.evaluatePreconditions(new EntityTag(sETag));

		// both are matching use client cached data
		if (builder != null) {
			return builder.build();
		}
		cc = new CacheControl();
		cc.setMaxAge(1000 * 60 * 5);
		cc.setMustRevalidate(true);
		response = Response.ok(trainStatus).cacheControl(cc).tag(new EntityTag(sETag)).build();
		return response;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/status/{day}")
	public Response updateRunningStatus(@PathParam("day") int day, TrainStatus trainStatus) throws URISyntaxException {
		String id = null;
		int trainNo = 0;

		trainNo = trainStatus.getTrainNo();

		id = trainNo + ":" + day;
		if (railDb.containsKey(id) == false) {
			railDb.put(id, trainStatus);
			return Response.created(new URI("/status/" + trainNo + "/" + day)).build();
		}
		railDb.put(id, trainStatus);
		return Response.noContent().build();
	}

}
