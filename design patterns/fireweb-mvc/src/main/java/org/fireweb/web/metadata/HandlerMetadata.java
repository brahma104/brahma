package org.fireweb.web.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HandlerMetadata implements Serializable {
	protected String path;
	protected String handlerClass;
	protected List<ForwardMetadata> forwardMetadatas;

	public HandlerMetadata() {
		forwardMetadatas = new ArrayList<>();
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
		forwardMetadatas.add(forwardMetadata);
	}

	public ForwardMetadata getForwardMetadata(String forwardName) {
		ForwardMetadata forwardMetadata = null;

		for (ForwardMetadata fm : forwardMetadatas) {
			if (fm.getForwardName().equals(forwardName)) {
				forwardMetadata = fm;
				break;
			}
		}
		return forwardMetadata;
	}
}
