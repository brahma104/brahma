package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EditCityHandler implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void updateCity(int cityId, String cityName) {
		System.out.println("update the city in database");
		ReloadCacheEvent event = new ReloadCacheEvent(this, "tblCities");
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
