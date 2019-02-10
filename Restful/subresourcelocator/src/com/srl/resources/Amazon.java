package com.srl.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root Resource class
 * 
 * @author Sriman
 *
 */
@Path("/amazon")
public class Amazon {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/helpline/{region}")
	public String helpline(@PathParam("region") String region) {
		return "988-9383-3939";
	}

	/*
	 * @Path("/store") public AmazonStore storeServices() {
	 * System.out.println("storeServices()"); return new AmazonStore(); }
	 * 
	 * @Path("/music") public AmazonMusic musicServices() {
	 * System.out.println("musicServices"); return new AmazonMusic(); }
	 */

	@Path("/{serviceType}")
	public Object amazonServices(@PathParam("serviceType") String serviceType) {
		if (serviceType.equals("store")) {
			return new AmazonStore();
		} else if (serviceType.equals("music")) {
			return new AmazonMusic();
		}
		return null;
	}

}














