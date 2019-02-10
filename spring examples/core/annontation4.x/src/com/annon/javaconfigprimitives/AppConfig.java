package com.annon.javaconfigprimitives;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/annon/javaconfigprimitives/branches.properties")
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean
	public Branch srNagarBranch() {
		Branch branch = null;
		branch = new Branch();
		branch.setBranchNo(env.getProperty("srNagarBranchNo", Integer.class));
		branch.setBranchName(env.getProperty("srNagarBranchName"));
		return branch;
	}

	@Bean
	public Branch panjaguttaBranch() {
		Branch branch = null;

		branch = new Branch();
		branch.setBranchNo(env.getProperty("punjaguttaBranchNo", Integer.class));
		branch.setBranchName(env.getProperty("punjaguttaBranchName"));
		return branch;
	}
}
