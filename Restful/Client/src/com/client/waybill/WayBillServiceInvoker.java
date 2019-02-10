package com.client.waybill;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class WayBillServiceInvoker {
	private final String BASE_URI = "http://localhost:8081/ContentHandler/ch/waybill";

	public String create(String data) {
		String wayBillInfo = null;
		ClientBuilder cBuilder = null;
		Client client = null;
		WebTarget target = null;
		Invocation.Builder iBuilder = null;
		Invocation invocation = null;
		Response response = null;

		cBuilder = ClientBuilder.newBuilder();
		client = cBuilder.build();
		target = client.target(BASE_URI).path("/in");
		iBuilder = target.request();
		invocation = iBuilder.buildPost(Entity.text(data));
		response = invocation.invoke();
		System.out.println("status : " + response.getStatus());
		if(response.getStatus() == 200) {
			response.bufferEntity();
			wayBillInfo = response.readEntity(String.class);
		}
		

		return wayBillInfo;
	}
}













