package com.jb.common;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.jb.resources.Netbanking;

/*@ApplicationPath("/jersey")*/
public class HdfcResourceConfig extends ResourceConfig {
	public HdfcResourceConfig() {
		super.register(new Netbanking());
	}

}
