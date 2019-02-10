package com.ji.hp.resources;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

@Path("/uber")
public class Uber {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/ride/{source}/{destination}")
	public String ride(@PathParam("source") PathSegment sourcePathSegment,
			@PathParam("destination") PathSegment destinationPathSegment, @QueryParam("rideDate") Date rideDate,
			@CookieParam("appId") String appId, @CookieParam("un") String username,
			@HeaderParam("location") String location) {
		return "source : " + sourcePathSegment.getPath() + ";area="
				+ sourcePathSegment.getMatrixParameters().getFirst("area") + " destination : "
				+ destinationPathSegment.getPath() + ";area="
				+ destinationPathSegment.getMatrixParameters().getFirst("area") + " rideDate : " + rideDate
				+ " appId : " + appId + " username : " + username + " location : " + location;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/find/{location}/{rideType}/{paymentMethod}")
	public String findCabs(@Context UriInfo uriInfo) {
		List<PathSegment> pathSegments = null;
		StringBuffer buffer = null;

		pathSegments = uriInfo.getPathSegments();
		buffer = new StringBuffer();

		for (PathSegment ps : pathSegments) {
			buffer.append(ps.getPath()).append(";").append(extractParameters(ps.getMatrixParameters())).append("/");
		}
		buffer.append(" query : ").append(extractParameters(uriInfo.getQueryParameters()));
		return buffer.toString();
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String ride(@Context HttpHeaders headers) {
		MultivaluedMap<String, String> headersMap = null;
		Map<String, Cookie> cookiesMap = null;

		StringBuffer buffer = new StringBuffer();

		headersMap = headers.getRequestHeaders();
		buffer.append("headers : " + extractParameters(headersMap));
		buffer.append(" cookies : ");
		cookiesMap = headers.getCookies();
		for (String cookieName : cookiesMap.keySet()) {
			buffer.append(cookieName + " : " + cookiesMap.get(cookieName).getValue()).append("--");
		}
		return buffer.toString();
	}

	private String extractParameters(MultivaluedMap<String, String> mpMap) {
		StringBuffer sb = new StringBuffer();

		for (String paramName : mpMap.keySet()) {
			sb.append(paramName).append("=");
			for (String paramValue : mpMap.get(paramName)) {
				sb.append(paramValue).append(",");
			}
			sb.append(";");
		}
		return sb.toString();
	}

}
