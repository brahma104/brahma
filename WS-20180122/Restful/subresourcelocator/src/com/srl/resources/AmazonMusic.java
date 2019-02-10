package com.srl.resources;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

/**
 * Sub-Resource Class
 * @author Sriman
 *
 */
public class AmazonMusic {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/track/{subscriptionNo}")
	public StreamingOutput track(@PathParam("subscriptionNo") final String SubscriptionNo) {
		return new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				StringBuffer buffer = new StringBuffer();
				buffer.append("<trackingStatus><subscriptionNo>").append(SubscriptionNo)
						.append("</subscriptionNo><status>Pending</status>").append("</trackingStatus>");
				os.write(buffer.toString().getBytes());
				os.close();
			}
		};
	}
}








