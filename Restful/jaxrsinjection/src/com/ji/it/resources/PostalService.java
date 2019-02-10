package com.ji.it.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/post")
public class PostalService {
	@QueryParam("bookingNo")
	private String bookingNo;



	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getConsignmentStatus() {
		return "In-Transit For bookingNo : " + bookingNo + " hc : " + this.hashCode();
	}
}
