package com.annon.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@ActiveProfiles("dev")
@Import({ PersistenceDevConfig.class, PersistenceTestConfig.class })
@ComponentScan(basePackages = { "com.annon.profile" })
public class RootConfig {

}
