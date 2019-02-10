package com.ji.fp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

@Path("/product")
public class ProductService {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String addProduct(@FormParam("productName") String productName, @FormParam("description") String description,
			@FormParam("productType") String productType, @FormParam("price") float price) {
		return "productName :" + productName + " description : " + description + " productType :" + productType
				+ " price : " + price;
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/dynamic")
	public String addProduct(MultivaluedMap<String, String> formData) {
		return extractParameters(formData);
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{productNo}")
	public String getProduct(@PathParam("productNo") ProductNo productNo) {
		return productNo.toString();
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









