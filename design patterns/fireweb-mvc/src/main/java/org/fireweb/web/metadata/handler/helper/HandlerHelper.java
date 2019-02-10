package org.fireweb.web.metadata.handler.helper;

import org.fireweb.web.exception.HandlerInstantiationFailedException;
import org.fireweb.web.handler.Handler;
import org.fireweb.web.metadata.FireWebMetadata;
import org.fireweb.web.metadata.HandlerMetadata;

public class HandlerHelper {
	public static Handler getHandler(String requestUri, FireWebMetadata fireWebMetadata) {
		Handler handler = null;
		String handlerClass = null;
		HandlerMetadata handlerMetada = null;

		try {
			handlerMetada = fireWebMetadata.getHandlerMetadata(requestUri);
			handlerClass = handlerMetada.getHandlerClass();
			handler = (Handler) Class.forName(handlerClass).newInstance();
		} catch (Exception e) {
			throw new HandlerInstantiationFailedException("Failed in Instantiating handler for request : " + requestUri,
					e);
		}
		return handler;
	}
}
