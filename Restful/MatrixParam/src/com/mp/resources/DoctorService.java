package com.mp.resources;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/doctor")
public class DoctorService {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/search/{location}/{specialization}")
	public StreamingOutput search(@PathParam("location") String location,
			@PathParam("specialization") String specialization,
			@QueryParam("experience") @DefaultValue("1") int experience,
			@MatrixParam("qualification") String qualification, @MatrixParam("experience") int mExperience) {

		final StringBuffer buffer = new StringBuffer().append("<doctors><location>").append(location)
				.append("</location><specialization>").append(specialization).append("</specialization><experience>")
				.append(experience).append("</experience><qualification>").append(qualification)
				.append("</qualification><mExperience>").append(mExperience).append("</mExperience>")
				.append("</doctors>");

		return new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				os.write(buffer.toString().getBytes());
				os.close();
			}
		};
	}
}
