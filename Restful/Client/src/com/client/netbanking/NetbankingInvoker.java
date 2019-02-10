package com.client.netbanking;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

public class NetbankingInvoker {

	public Account openAccount(Application application) {
		Response response = ClientBuilder.newClient()
				.target("http://localhost:8082/CustomContentHandler/api/netbanking").request()
				.post(Entity.xml(application));
		Account account = response.readEntity(Account.class);
		return account;
	}
}
