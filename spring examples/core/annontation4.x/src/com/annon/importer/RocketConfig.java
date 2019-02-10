package com.annon.importer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RocketConfig {
	@Bean
	public Rocket rocket() {
		return new Rocket();
	}
}
