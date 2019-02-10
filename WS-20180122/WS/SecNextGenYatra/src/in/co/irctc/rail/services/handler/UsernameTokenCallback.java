package in.co.irctc.rail.services.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class UsernameTokenCallback implements CallbackHandler {
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		boolean flag = false;
		int index = 0;
		System.out.println("UsernameToken : " +WSPasswordCallback.USERNAME_TOKEN_UNKNOWN);
		for (int i = 0; i < callbacks.length; i++) {
			System.out.println("Usage : " + ((WSPasswordCallback) callbacks[i]).getUsage());
			
			if (((WSPasswordCallback) callbacks[i]).getUsage() == WSPasswordCallback.USERNAME_TOKEN_UNKNOWN) {
				WSPasswordCallback wspCallback = (WSPasswordCallback) callbacks[i];
				System.out.println("un : " +wspCallback.getIdentifier());
				System.out.println("password : " +wspCallback.getPassword());
				
				if (wspCallback.getIdentifier().equals("john") && wspCallback.getPassword().equals("welcome1")) {
					flag = true;
					break;
				} else {
					index = i;
				}
			}
		}
		if (flag == false) {
			throw new UnsupportedCallbackException(callbacks[index], "username and password is not valid");
		}
	}
}
