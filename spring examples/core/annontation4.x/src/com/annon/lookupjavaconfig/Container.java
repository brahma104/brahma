package com.annon.lookupjavaconfig;

abstract public class Container {
	public void receive(String data) {
		RequestHandler requestHandler = null;

		requestHandler = lookupRequestHandler();
		requestHandler.setData(data);
		requestHandler.processRequest();
	}

	abstract public RequestHandler lookupRequestHandler();
}
