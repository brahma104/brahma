package com.annon.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/annon/profile/dbtest.properties")
@Profile("test")
public class PersistenceTestConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public ConnectionFactory connectionFactory() {
		System.out.println("test");
		ConnectionFactory cf = new ConnectionFactory();
		cf.setDriverClassName(env.getProperty("db.driverClassName"));
		cf.setUrl(env.getProperty("db.url"));
		cf.setUsername(env.getProperty("db.username"));
		cf.setPassword(env.getProperty("db.password"));
		
		return cf;
	}
}













