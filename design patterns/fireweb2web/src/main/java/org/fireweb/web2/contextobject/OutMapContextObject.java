package org.fireweb.web2.contextobject;

import java.util.HashMap;
import java.util.Map;

public class OutMapContextObject implements OutContextObject {
	protected Map<String, Object> outMap;
	protected String forwardName;

	public OutMapContextObject() {
		outMap = new HashMap<>();
	}

	@Override
	public void setForwardName(String forwardName) {
		this.forwardName = forwardName;
	}

	@Override
	public void addAttribute(String attrName, Object attrValue) {
		outMap.put(attrName, attrValue);
	}

	@Override
	public Map<String, Object> getAttributes() {
		return outMap;
	}

	@Override
	public String getForwardName() {
		return forwardName;
	}

}
