package org.fireweb.web2.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.web2.contextobject.InContextObject;
import org.fireweb.web2.contextobject.OutContextObject;
import org.fireweb.web2.dispatcher.Dispatcher;
import org.fireweb.web2.handler.Handler;
import org.fireweb.web2.handler.helper.HandlerHelper;
import org.fireweb.web2.mapper.Mapper;
import org.fireweb.web2.mapper.MapperFactory;
import org.fireweb.web2.metadata.Fireweb2Metatadata;

public class ApplicationController {
	public void process(HttpServletRequest request, HttpServletResponse response,
			Fireweb2Metatadata fireweb2Metatadata) {
		String path = null;
		Handler handler = null;
		Mapper<HttpServletRequest> mapper = null;
		InContextObject inContextObject = null;
		OutContextObject outContextObject = null;

		path = request.getServletPath();
		handler = HandlerHelper.getHandler(path, fireweb2Metatadata);
		mapper = (Mapper<HttpServletRequest>) MapperFactory.createMapper("http");
		inContextObject = mapper.extractInData(request);
		outContextObject = handler.performAction(inContextObject);
		mapper.bindOutData(outContextObject, request);
		Dispatcher.dispatch(request, response, path, outContextObject.getForwardName(), fireweb2Metatadata);
	}
}










