package com.ep.beans;

import org.springframework.context.ApplicationEvent;

public class ReloadCacheEvent extends ApplicationEvent {
	private String tableName;

	public ReloadCacheEvent(Object source, String tableName) {
		super(source);
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
