package com.client.incometax;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.Response;

public class IncomeTaxInvoker {

	public String fileReturns(String taxForm) throws InterruptedException, ExecutionException {
		Response response = null;
		String status = null;

		System.out.println("sending request....");
		Future<Response> future = ClientBuilder.newClient()
				.target("http://localhost:8082/AsyncIncomeTax/async/incometax").request().async()
				.post(Entity.xml(taxForm));

		System.out.println("independent to be ran without response");

		while (future.isDone() == false) {
			System.out.print(".");
		}
		System.out.println();
		response = future.get();
		System.out.println(response.getStatus());
		if (response.getStatus() == 200) {
			status = response.readEntity(String.class);
		}
		return status;
	}

	public void fileReturnsCallback(String taxForm) throws InterruptedException, ExecutionException {
		Response response = null;
		String status = null;

		System.out.println("sending request....");
		ClientBuilder.newClient()
				.target("http://localhost:8082/AsyncIncomeTax/async/incometax").request().async()
				.post(Entity.xml(taxForm), new ITRVCallbackHandler());

		System.out.println("independent to be ran without response");
		
	}
	
	private final class ITRVCallbackHandler implements InvocationCallback<Response> {

		@Override
		public void completed(Response response) {
			String status = null;

			status = response.readEntity(String.class);
			System.out.println("status : " + status);
		}

		@Override
		public void failed(Throwable e) {
			e.printStackTrace();
		}

	}

}
