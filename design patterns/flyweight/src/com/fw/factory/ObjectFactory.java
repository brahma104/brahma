package com.fw.factory;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
	private Map<String, Object> objectPool;

	public ObjectFactory() {
		objectPool = new HashMap<>();
	}

	public Object getObject(String className)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object obj = null;

		if (objectPool.containsKey(className) == false) {
			obj = Class.forName(className).newInstance();
			objectPool.put(className, obj);
		}
		return objectPool.get(className);
	}
}
