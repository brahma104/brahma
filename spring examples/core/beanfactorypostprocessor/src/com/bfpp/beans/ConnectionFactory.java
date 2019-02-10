package com.bfpp.beans;

public class ConnectionFactory {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public ConnectionFactory(String driverClassName, String url, String username, String password) {
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionFactory [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}

}
