package com.client.nextgen;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.internal.util.Base64;

import com.nextgen.dto.AvailableTrains;

public class NextGenInvoker {
	private final String BASE_URI = "http://localhost:8082/SecureNextGen/services/train/availability";

	public AvailableTrains getTrainsBetweenStations(String source, String destination) {
		ClientBuilder cBuilder = null;
		Client client = null;
		WebTarget target = null;
		Invocation.Builder builder = null;
		Invocation invocation = null;
		Response response = null;
		AvailableTrains aTrains = null;

		cBuilder = ClientBuilder.newBuilder();
		cBuilder.register(BasicAuthenticationFilter.class);
		
		client = cBuilder.build();
		target = client.target(BASE_URI).path("/between/{source}/{destination}").resolveTemplate("source", source)
				.resolveTemplate("destination", destination);

		builder = target.request();
		invocation = builder.buildGet();
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			aTrains = response.readEntity(AvailableTrains.class);
		} else {
			System.out.println(response.readEntity(String.class));
		}

		return aTrains;
	}
}
