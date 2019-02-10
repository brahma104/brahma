package com.mr.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mr.bo.UserBo;
import com.mr.dao.UserAccountDao;
import com.mr.security.bean.UserDetailsImpl;

@Service
public class CsrDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserAccountDao userAccountDao;

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
