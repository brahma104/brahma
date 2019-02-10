package com.formsec.bo;

public class UserBo {
	protected int userId;
	protected String username;
	protected String password;
	protected int locked;
	protected int disabled;
	protected RoleBo role;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLocked() {
		return locked;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public int getDisabled() {
		return disabled;
	}

	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}

	public RoleBo getRole() {
		return role;
	}

	public void setRole(RoleBo role) {
		this.role = role;
	}

}
