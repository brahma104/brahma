package com.sweb.endpoints;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {

	@Override
	public Health health() {
		Random random = null;
		Health health = null;
		
		random = new Random();
		boolean appStatus = random.nextBoolean();
		System.out.println("appStatus: "+ appStatus);
		if (appStatus == true) {
			health = Health.up().build();
		} else {
			health = Health.down().withDetail("error", "random").build();
		}

		return health;
	}

}
