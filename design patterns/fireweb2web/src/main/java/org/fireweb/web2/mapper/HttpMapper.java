package org.fireweb.web2.mapper;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.fireweb.web2.contextobject.ContextObjectFactory;
import org.fireweb.web2.contextobject.InContextObject;
import org.fireweb.web2.contextobject.OutContextObject;

public class HttpMapper implements Mapper<HttpServletRequest> {

	@Override
	public InContextObject extractInData(HttpServletRequest request) {
		InContextObject inContextObject = null;
		Map<String, String[]> requestParameterMap = null;

		inContextObject = ContextObjectFactory.createInContextObject();
		requestParameterMap = request.getParameterMap();
		for (String paramName : requestParameterMap.keySet()) {
			String[] paramValues = requestParameterMap.get(paramName);
			for (String paramValue : paramValues) {
				inContextObject.bindParameter(paramName, paramValue);
			}
		}

		return inContextObject;
	}

	@Override
	public void bindOutData(OutContextObject outContextObject, HttpServletRequest request) {
		Map<String, Object> respDataMap = null;

		respDataMap = outContextObject.getAttributes();
		for (String paramName : respDataMap.keySet()) {
			request.setAttribute(paramName, respDataMap.get(paramName));
		}
	}

}
