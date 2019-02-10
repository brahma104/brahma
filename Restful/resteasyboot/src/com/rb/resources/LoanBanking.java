package com.rb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/loan")
public class LoanBanking {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public float getRateOfInterest(@QueryParam("loanType") String loanType) {
		return 10.25f;
	}
}
