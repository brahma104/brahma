package org.fireweb.web.metadata;

import java.util.HashMap;
import java.util.Map;

public class FireWebMetadata {
	protected Map<String, HandlerMetadata> handlerMetadataMap;

	public FireWebMetadata() {
		handlerMetadataMap = new HashMap<>();
	}

	public void addHandlerMetada(HandlerMetadata handlerMetadata) {
		handlerMetadataMap.put(handlerMetadata.getPath(), handlerMetadata);
	}

	public HandlerMetadata getHandlerMetadata(String path) {
		return handlerMetadataMap.get(path);
	}

	public ForwardMetadata getForwardMetdata(String path, String forwardName) {
		return handlerMetadataMap.get(path).getForwardMetadata(forwardName);
	}

}
