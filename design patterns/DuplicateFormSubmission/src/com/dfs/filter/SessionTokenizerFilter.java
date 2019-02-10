package com.dfs.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/*" })
public class SessionTokenizerFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		String sToken = null;
		String cToken = null;
		String reqMethod = null;
		HttpSession httpSession = null;
		HttpServletRequest httpReq = null;
		HttpServletResponse httpResp = null;

		httpReq = (HttpServletRequest) req;
		httpResp = (HttpServletResponse) resp;

		httpSession = httpReq.getSession(false);

		// first request from the user
		if (httpSession == null) {
			httpSession = httpReq.getSession();
		} else {
			reqMethod = httpReq.getMethod();
			if (reqMethod.equalsIgnoreCase("post")) {
				cToken = httpReq.getParameter("cToken");
				sToken = (String) httpSession.getAttribute("sToken");
				if (cToken.equals(sToken) == false) {
					httpSession.invalidate();
					httpResp.sendRedirect("dup-form-error.jsp");
					return;
				}
			}
		}

		sToken = UUID.randomUUID().toString();
		httpSession.setAttribute("sToken", sToken);
		httpReq.setAttribute("cToken", sToken);
		filterChain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

}
