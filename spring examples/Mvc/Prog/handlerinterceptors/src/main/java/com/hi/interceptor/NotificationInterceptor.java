package com.hi.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hi.dto.NotificationDto;

public class NotificationInterceptor extends HandlerInterceptorAdapter {
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		List<NotificationDto> notifications = null;

		notifications = new ArrayList<NotificationDto>();
		notifications.add(new NotificationDto("iPhone-x is available", "ur"));
		notifications.add(new NotificationDto("iWatch is available", "r"));
		notifications.add(new NotificationDto("Addidas Shoes are available", "ur"));
		notifications.add(new NotificationDto("Dell Inspiron 5506 is in stock", "ur"));
		notifications.add(new NotificationDto("DSLR 3005 is in stock", "r"));

		modelAndView.addObject("notifications", notifications);

	}

}
