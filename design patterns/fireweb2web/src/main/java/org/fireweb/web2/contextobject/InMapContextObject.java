package org.fireweb.web2.contextobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMapContextObject implements InContextObject {
	protected Map<String, List<String>> inMap;

	public InMapContextObject() {
		inMap = new HashMap<>();
	}

	@Override
	public String getParameter(String paramName) {
		if (inMap.containsKey(paramName)) {
			return inMap.get(paramName).get(0);
		}
		return null;
	}

	@Override
	public List<String> getParameters(String paramName) {
		if (inMap.containsKey(paramName)) {
			return inMap.get(paramName);
		}
		return null;
	}

	@Override
	public Map<String, List<String>> getParameterMap() {
		return inMap;
	}

	@Override
	public void bindParameter(String paramName, String paramValue) {
		List<String> paramValues = null;

		if (inMap.containsKey(paramName)) {
			paramValues = inMap.get(paramName);
		} else {
			paramValues = new ArrayList<>();
		}
		paramValues.add(paramValue);
		inMap.put(paramName, paramValues);
	}

}
