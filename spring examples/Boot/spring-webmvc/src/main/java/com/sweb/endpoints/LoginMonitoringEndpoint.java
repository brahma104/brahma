package com.sweb.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "loginmonitoring")
public class LoginMonitoringEndpoint {

	@ReadOperation
	public String loginMetrics() {
		return "{'hits':'30'}";
	}
}
