package com.client.uber;

import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class UberInvoker {
	private final String BASE_URI = "http://localhost:8081/jaxrsinjection/api/uber";

	public String ride(String source, String destination, String sourceArea, String destinationArea, Date rideDate,
			String appId, String un, String location) {
		ClientBuilder cBuilder = null;
		Client client = null;
		WebTarget target = null;
		Invocation.Builder iBuilder = null;
		Invocation invocation = null;
		String rideStatus = null;

		try {
			cBuilder = ClientBuilder.newBuilder();
			cBuilder.property("connection.timeout", 6000);

			client = cBuilder.build();
			client.property("connection.timeout", 7000);

			target = client.target(BASE_URI);
			target.property("connection.timeout", 8000);

			target = target.path("/ride/{source}").matrixParam("area", sourceArea).path("{destination}")
					.matrixParam("area", destinationArea).resolveTemplate("source", source)
					.resolveTemplate("destination", destination);

			iBuilder = target.request();
			iBuilder = iBuilder.header("location", location).cookie("appId", appId).cookie("un", un);
			invocation = iBuilder.buildPost(null);
			Response response = invocation.invoke();
			if (response.getStatus() == 200) {
				rideStatus = response.readEntity(String.class);
			}

		} finally {
			if (client != null) {
				client.close();
			}
		}
		return rideStatus;
	}

}
