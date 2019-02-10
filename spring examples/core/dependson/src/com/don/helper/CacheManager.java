package com.don.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.don.accessor.IAccessor;

public class CacheManager {
	private List<IAccessor> accessors;
	private Cache cache;

	public CacheManager(List<IAccessor> accessors, Cache cache) {
		this.accessors = accessors;
		this.cache = cache;
		load();
	}

	public void load() {
		String identifier = null;
		Object data = null;
		Map<String, Object> lMap = null;

		lMap = new HashMap<>();
		for (IAccessor accessor : accessors) {
			try {
				identifier = accessor.getIdentifier();
				data = accessor.getData();
				lMap.put(identifier, data);
			} catch (Exception e) {
				e.printStackTrace();
				// eat exception and continue...
			}
		}
		if (lMap.size() > 0) {
			cache.load(lMap);
		}
	}

}
