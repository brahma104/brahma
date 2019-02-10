package com.client.nextgen;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;

public class BasicAuthenticationFilter implements ClientRequestFilter {
	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		MultivaluedMap<String, Object> headers = requestContext.getHeaders();
		String authorization = null;
		authorization = BasicAuthenticationHelper.getAuthorization("scott", "welcome1");
		headers.add("authorization", authorization);
	}

}
