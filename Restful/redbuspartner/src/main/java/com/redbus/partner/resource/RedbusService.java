package com.redbus.partner.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/redbus")
@Api(description = "This is redbus partner service", protocols = "http")
public class RedbusService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/ticket/{source}/{destination}")
	@ApiResponses({ @ApiResponse(code = 200, message = "price of the ticket") })
	@ApiOperation(httpMethod = "GET", value = "getTicketPrice")
	public float getTicketPrice(@ApiParam(name = "source", type = "string") @PathParam("source") String source,
			@ApiParam(name = "destination", type = "string") @PathParam("destination") String destination) {
		return 353.34f;
	}

}
