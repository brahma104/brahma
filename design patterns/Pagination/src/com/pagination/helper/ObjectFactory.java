package com.pagination.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.pagination.exception.GenericException;

public class ObjectFactory {
	private Map<String, Object> objectMap;
	private static ObjectFactory instance;

	private ObjectFactory() {
		objectMap = new ConcurrentHashMap<>();
	}

	public static ObjectFactory getInstance() {
		if (instance == null) {
			synchronized (ObjectFactory.class) {
				if (instance == null) {
					instance = new ObjectFactory();
				}

			}
		}
		return instance;
	}

	public Object getObject(String clazz) {
		Object obj = null;

		if (objectMap.containsKey(clazz) == false) {
			try {
				obj = Class.forName(clazz).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				throw new GenericException("unable to instantiate object", e);
			}
			objectMap.put(clazz, obj);
		}
		return objectMap.get(clazz);
	}
}











