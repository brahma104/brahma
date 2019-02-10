package com.annon.profile;

public class ConnectionFactory {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public String getConnection() {
		return "ConnectionFactory [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
