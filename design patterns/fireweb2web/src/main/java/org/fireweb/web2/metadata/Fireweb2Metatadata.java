package org.fireweb.web2.metadata;

import java.util.HashMap;
import java.util.Map;

public class Fireweb2Metatadata {
	protected Map<String, HandlerMetadata> handlerMetadataMap;

	public Fireweb2Metatadata() {
		handlerMetadataMap = new HashMap<>();
	}

	public void addHandlerMetadata(HandlerMetadata handlerMetadata) {
		handlerMetadataMap.put(handlerMetadata.getPath(), handlerMetadata);
	}

	public String getHandlerClass(String path) {
		String handlerClass = null;

		if (handlerMetadataMap.containsKey(path)) {
			handlerClass = handlerMetadataMap.get(path).getHandlerClass();
		}
		return handlerClass;
	}

	public String getForwardPage(String path, String forwardName) {
		String page = null;
		ForwardMetadata forwardMetadata = null;

		if (handlerMetadataMap.containsKey(path)) {
			forwardMetadata = handlerMetadataMap.get(path).getForwardMetadata(forwardName);
			if (forwardMetadata != null) {
				page = forwardMetadata.getPage();
			}
		}
		return page;
	}
}
















