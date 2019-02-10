package com.client.nextgen;

import org.glassfish.jersey.internal.util.Base64;

public class BasicAuthenticationHelper {
	public static String getAuthorization(String userName, String password) {
		String authorization = null;

		authorization = "Basic " + Base64.encodeAsString(userName + ":" + password);

		return authorization;
	}
}
