package com.incometax.resources;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.incometax.dto.ITRVForm;
import com.incometax.dto.TaxSheet;

@Path("/incometax")
public class IncomeTaxService {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	public void fileGstReturns(final TaxSheet taxSheet, final @Suspended AsyncResponse asyncResponse) {

		new Thread() {
			@Override	
			public void run() {
				try {
					Thread.sleep(8000L);
					ITRVForm itrvForm = null;
					itrvForm = new ITRVForm();
					itrvForm.setPanNo(taxSheet.getPanNo());
					itrvForm.setAckNo(UUID.randomUUID().toString());
					itrvForm.setStatus("accepted");
					asyncResponse.resume("accepted");
				} catch (InterruptedException e) {
					throw new WebApplicationException(e);
				}
			}
		}.start();
	}
}









