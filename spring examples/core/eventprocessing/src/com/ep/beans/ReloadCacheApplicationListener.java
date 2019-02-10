package com.ep.beans;

import org.springframework.context.ApplicationListener;

public class ReloadCacheApplicationListener implements ApplicationListener<ReloadCacheEvent> {

	@Override
	public void onApplicationEvent(ReloadCacheEvent event) {
		System.out.println("reloading the cache for table : " + event.getTableName());
	}

}
