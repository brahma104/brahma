package com.pathparam.resources;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/amazon")
public class AmazonStore {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/products/{category}/{productType}/{minPrice}/{maxPrice}")
	public StreamingOutput products(final @PathParam("category") String category,
			final @PathParam("productType") String productType, final @PathParam("minPrice") float minPrice,
			final @PathParam("maxPrice") float maxPrice) {

		return new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				StringBuffer buffer = new StringBuffer();
				buffer.append("<products><product>").append(category).append("</product><product>").append(productType)
						.append("</product><product>").append(minPrice).append("</product><product>").append(maxPrice)
						.append("</product></products>");
				os.write(buffer.toString().getBytes());
				os.close();
			}
		};
	}

}
