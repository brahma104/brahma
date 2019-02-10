package com.client.paytm;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

public class PayTMClient {
	public static void main(String[] args) {
		/*ClientBuilder builder = ClientBuilder.newBuilder();
		builder.property("connection.timeout", 6000);

		Client client = builder.build();
		Invocation.Builder invocationBuilder = client.target("http://localhost:8081/PayTM/api/wallet?mobile=93039")
				.request();
		Invocation invocation = invocationBuilder.buildGet();
		Response response = invocation.invoke();
		if(response.getStatus() == 200) {
			float balance = response.readEntity(Float.class);
			System.out.println("balance : " +balance);
		}*/
		float balance = ClientBuilder.newClient().target("http://localhost:8081/PayTM/api/wallet?mobile=3930494").request().get(Float.class);
		System.out.println("balance : " + balance);
	}
}


























