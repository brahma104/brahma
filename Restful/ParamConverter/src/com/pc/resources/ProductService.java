package com.pc.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pc.dto.Price;

@Path("/product")
public class ProductService {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{productNo}/{productName}/{price}")
	public String addProduct(@PathParam("productNo") String productNo, @PathParam("productName") String productName,
			@PathParam("price") Price price) {
		return "product : " + productNo + " of price : " + price.toString() + "added";
	}

}
