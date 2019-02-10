package org.fireweb.web2.contextobject;

import java.util.List;
import java.util.Map;

public interface InContextObject {
	String getParameter(String paramName);

	List<String> getParameters(String paramName);

	Map<String, List<String>> getParameterMap();

	void bindParameter(String paramName, String paramValue);
}
