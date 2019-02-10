package com.annon.importer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ RocketConfig.class, LauncherConfig.class })
public class RootConfig {

}
