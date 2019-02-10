package com.mr.security.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	protected String username;
	protected String password;
	protected int locked;
	protected int disabled;
	protected String roleName;
	protected Collection<SimpleGrantedAuthority> authorities;

	public UserDetailsImpl(String username, String password, int locked, int disabled, String roleName) {
		super();
		this.username = username;
		this.password = password;
		this.locked = locked;
		this.disabled = disabled;
		this.roleName = roleName;
		authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(roleName));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		if (locked == 1) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		if (disabled == 1) {
			return false;
		}
		return true;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
