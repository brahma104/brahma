package com.formsec.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.formsec.bo.UserBo;
import com.formsec.dao.UserAccountDao;
import com.formsec.security.bean.UserDetailsImpl;

public class UserDetailsServiceImpl implements UserDetailsService {

	private UserAccountDao userAccountDao;

	public UserDetailsServiceImpl(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserBo userBo = null;
		UserDetails userDetails = null;

		userBo = userAccountDao.getUser(username);
		if (userBo == null) {
			throw new UsernameNotFoundException("username not found exception");
		}
		userDetails = new UserDetailsImpl(userBo.getUsername(), userBo.getPassword(), userBo.getLocked(),
				userBo.getDisabled(), userBo.getRole().getRoleName());

		return userDetails;
	}

}
