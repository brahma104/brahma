package com.sr.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sr.dto.MatchingPolicies;

@Path("/insurance")
public class InsuranceService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/policy/{policyNo}")
	public Response getPolicyName(@PathParam("policyNo") String policyNo) {
		Response response = null;
		ResponseBuilder builder = null;

		builder = Response.status(202);
		builder = builder.entity("policy no : " + policyNo + " Name : jeevan saphal");
		response = builder.build();

		return response;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/policy/{policyNo}/due")
	public Response getPremiumDue(@PathParam("policyNo") String policyNo) {
		Response response = null;
		ResponseBuilder builder = null;

		builder = Response.ok();
		builder = builder.entity(9384.3f);
		builder = builder.header("branch", "b3039");
		response = builder.build();

		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/policy/{type}")
	public Response getPolicies(@PathParam("type") String policyType) {
		Response response = null;
		ResponseBuilder builder = null;
		MatchingPolicies matchingPolicies = null;
		List<String> policies = null;

		policies = new ArrayList<>();
		policies.add("jeevan saphal");
		policies.add("jeevan jyothi");
		policies.add("jeeven anand");
		matchingPolicies = new MatchingPolicies();
		matchingPolicies.setPolicies(policies);

		/*
		 * builder = Response.ok(); builder = builder.cookie(new NewCookie("site",
		 * "web")); builder = builder.header("branch", "b039"); builder =
		 * builder.entity(matchingPolicies); response = builder.build();
		 */

		return Response.ok().header("branch", "338").cookie(new NewCookie("site", "web")).entity(matchingPolicies)
				.build();
	}
}














