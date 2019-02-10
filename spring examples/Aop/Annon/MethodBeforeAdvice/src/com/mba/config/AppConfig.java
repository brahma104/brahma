package com.mba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.mba.helper.SecurityManager;

@Configuration
@ComponentScan(basePackages = { "com.mba.beans", "com.mba.aspect", "com.mba.helper" })
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public SecurityManager securityManager() {
		return SecurityManager.getInstance();
	}
}
