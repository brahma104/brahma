package com.annon.lookupstereotype;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Container {
	public void receive(String data) {
		RequestHandler requestHandler = null;
		
		requestHandler = lookupRequestHandler();
		requestHandler.setData(data);
		requestHandler.processRequest();
	}
	
	@Lookup
	public RequestHandler lookupRequestHandler() {
		return null;
	}
}
