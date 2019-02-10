package com.annon.stereojavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.annon.stereojavaconfig" })
public class AppConfig {
	@Bean
	public Participant host() {
		Participant host = null;
		host = new Participant();
		host.setParticipantNo(1);
		host.setParticipantName("Steve");
		return host;
	}
}
