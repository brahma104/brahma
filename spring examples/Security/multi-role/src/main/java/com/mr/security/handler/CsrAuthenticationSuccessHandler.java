package com.mr.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.mr.security.bean.UserDetailsImpl;

@Component
public class CsrAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		UserDetailsImpl userDetails = null;
		String redirectUrl = null;

		if (authentication.getClass().isAssignableFrom(AnonymousAuthenticationToken.class) == false) {
			userDetails = (UserDetailsImpl) authentication.getPrincipal();
			if (userDetails.getRoleName().equals("csr")) {
				redirectUrl = "/csr-dashboard.htm";
			} else {
				redirectUrl = "/tech-dashboard.htm";
			}
		}

		super.getRedirectStrategy().sendRedirect(request, response, redirectUrl);
	}

}
