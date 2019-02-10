package com.jb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/netbanking")
public class Netbanking {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public float getAccountBalance(@QueryParam("accountNo") String accountNo) {
		return this.hashCode();
	}
}
