package com.annon.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("loanCalculator")
public class CacheManager {

	public CacheManager() {
		System.out.println("cacheManager()");
	}

}
