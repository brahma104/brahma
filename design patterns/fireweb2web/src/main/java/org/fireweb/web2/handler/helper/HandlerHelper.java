package org.fireweb.web2.handler.helper;

import org.fireweb.web2.exception.HandlerInstantiationFailedException;
import org.fireweb.web2.handler.Handler;
import org.fireweb.web2.metadata.Fireweb2Metatadata;

public class HandlerHelper {
	public static Handler getHandler(String path, Fireweb2Metatadata fireweb2Metatadata) {
		String handlerClass = null;
		Handler handler = null;
		try {
			handlerClass = fireweb2Metatadata.getHandlerClass(path);
			handler = (Handler) Class.forName(handlerClass).newInstance();
		} catch (Exception e) {
			throw new HandlerInstantiationFailedException("failed in creating handler", e);
		}
		return handler;
	}
}
