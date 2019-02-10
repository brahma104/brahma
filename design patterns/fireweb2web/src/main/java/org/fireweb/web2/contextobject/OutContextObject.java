package org.fireweb.web2.contextobject;

import java.util.Map;

public interface OutContextObject {
	void setForwardName(String forwardName);

	void addAttribute(String attrName, Object attrValue);

	Map<String, Object> getAttributes();
	String getForwardName();
}
