package com.annon.importer;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LauncherConfig {
	@Bean(autowire = Autowire.BY_TYPE)
	public Launcher launcher() {
		return new Launcher();
	}
}
