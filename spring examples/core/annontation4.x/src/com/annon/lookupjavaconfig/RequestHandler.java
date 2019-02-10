package com.annon.lookupjavaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestHandler {
	private String data;

	public void processRequest() {
		System.out.println("processing data : " + data + " with agent : " + this.hashCode());
	}

	public void setData(String data) {
		this.data = data;
	}

}
