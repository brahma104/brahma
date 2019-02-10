package org.fireweb.web2.metadata;

import java.util.HashMap;
import java.util.Map;

public class HandlerMetadata {
	protected String path;
	protected String handlerClass;
	protected Map<String, ForwardMetadata> forwards;

	public HandlerMetadata() {
		forwards = new HashMap<>();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getHandlerClass() {
		return handlerClass;
	}

	public void setHandlerClass(String handlerClass) {
		this.handlerClass = handlerClass;
	}

	public void addForwardMetadata(String forwardName, String page) {
		ForwardMetadata forwardMetadata = null;

		forwardMetadata = new ForwardMetadata(forwardName, page);
		forwards.put(forwardName, forwardMetadata);
	}

	public ForwardMetadata getForwardMetadata(String forwardName) {
		return forwards.get(forwardName);
	}
}
