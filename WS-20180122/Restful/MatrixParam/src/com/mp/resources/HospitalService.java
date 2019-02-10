package com.mp.resources;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.StreamingOutput;

@Path("/hospital")
public class HospitalService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/search/{location}/{city}")
	public StreamingOutput search(final @PathParam("location") PathSegment locationPathSegment,
			final @PathParam("city") PathSegment cityPathSegment,
			final @QueryParam("hospitalType") String hospitalType) {

		return new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				StringBuffer buffer = new StringBuffer();

				buffer.append("<hospitals><location>").append(locationPathSegment.getPath());
				buffer.append(";").append(matrixParameters(locationPathSegment)).append("</location>").append("<city>")
						.append(cityPathSegment.getPath()).append(";").append(matrixParameters(cityPathSegment))
						.append("</city>");

				buffer.append("</hospitals>");
				os.write(buffer.toString().getBytes());
				os.close();
			}

			private String matrixParameters(PathSegment ps) {
				StringBuffer sb = new StringBuffer();
				MultivaluedMap<String, String> mpMap = null;

				mpMap = ps.getMatrixParameters();
				for (String paramName : mpMap.keySet()) {
					sb.append(paramName).append("=");
					for (String paramValue : mpMap.get(paramName)) {
						sb.append(paramValue).append(",");
					}
					sb.append(";");
				}
				return sb.toString();
			}
		};
	}
}
