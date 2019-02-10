package com.inf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAgentDetectionFilter implements Filter {
	private String[] browsers;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		boolean flag = false;
		String browser = null;
		HttpServletRequest httpRequest = null;

		httpRequest = (HttpServletRequest) request;
		System.out.println(httpRequest.getRequestURI());

		if (httpRequest.getRequestURI().endsWith("/invalid-useragent.jsp") == false) {
			browser = httpRequest.getHeader("User-Agent");
			System.out.println(browser);

			for (String ua : browsers) {
				if (browser.contains(ua) == true) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				((HttpServletResponse) response).sendRedirect("invalid-useragent.jsp");
				return;
			}
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String param = null;

		param = filterConfig.getInitParameter("browsers");
		if (param.indexOf(",") > 0) {
			browsers = param.split(",");
		} else {
			browsers = new String[] { param };
		}
	}

}
