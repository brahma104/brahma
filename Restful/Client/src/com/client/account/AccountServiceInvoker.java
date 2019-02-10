package com.client.account;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class AccountServiceInvoker {
	private final String BASE_URI = "http://localhost:8081/jaxrsinjection/api/account/{accountNo}";

	public String neftStatus(String accountNo, int transactionNo) {
		ClientBuilder builder = null;
		Client client = null;
		WebTarget target = null;
		Invocation.Builder invocationBuilder = null;
		Invocation invocation = null;
		String status = null;

		try {
			builder = ClientBuilder.newBuilder();
			builder.property("connection.timeout", 6000);
			client = builder.build();
			target = client.target(BASE_URI).resolveTemplate("accountNo", accountNo).path("neft/{transactionNo}/status")
					.resolveTemplate("transactionNo", transactionNo);
			invocationBuilder = target.request();
			invocation = invocationBuilder.buildGet();
			Response response = invocation.invoke();
			if (response != null) {
				if (response.getStatus() == 200) {
					status = response.readEntity(String.class);
				}
			}
		} finally {
			if (client != null) {
				client.close();
			}
		}
		return status;

	}

}
