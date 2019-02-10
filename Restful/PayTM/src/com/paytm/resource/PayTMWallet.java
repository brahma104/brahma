package com.paytm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/wallet")
public class PayTMWallet {
	@GET
	@Produces("text/plain")
	public double getBalance(@QueryParam("mobile") String mobile) {
		return 393.34;
	}
}
