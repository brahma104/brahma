package com.annon.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name = { "bigTruck" }, autowire = Autowire.BY_NAME)
	public Truck truck() {
		System.out.println("truck()");
		return new Truck();
	}

	@Bean
	public Engine engine() {
		return new Engine();
	}
}
