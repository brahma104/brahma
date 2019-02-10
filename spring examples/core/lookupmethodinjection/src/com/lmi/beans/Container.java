package com.lmi.beans;

abstract public class Container {
	public void handleRequest(String data) {
		RequestHandler requestHandler = null;

		requestHandler = lookupRequestHandler();
		requestHandler.setData(data);
		requestHandler.process();
	}

	public abstract RequestHandler lookupRequestHandler();
}
