package com.annon.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/annon/propertysource/tours.properties")
public class Holiday {
	@Value("${Holiday.destination}")
	private String destination;
	@Value("${Holiday.days}")
	private int days;

	@Override
	public String toString() {
		return "Holiday [destination=" + destination + ", days=" + days + "]";
	}

}
