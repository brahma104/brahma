package com.oyo.reservation.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class PasswordCallbackHandler implements CallbackHandler {
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback wspCallback = null;

		for (int i = 0; i < callbacks.length; i++) {
			wspCallback = (WSPasswordCallback) callbacks[i];
			if (wspCallback.getUsage() == WSPasswordCallback.USERNAME_TOKEN) {
				if (wspCallback.getIdentifier().equals("john")) {
					wspCallback.setPassword("welcome1");
				}
			}
		}

	}

}
