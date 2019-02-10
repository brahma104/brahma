package com.cdi.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppFactory {
	public static Object createObject(String lClassname) throws FileNotFoundException, IOException,
			ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties props = null;
		String className = null;
		Class clazz = null;
		Object obj = null;

		props = new Properties();
		props.load(new FileInputStream(
				"D:\\work\\master\\spring\\20180122\\core\\coredi\\src\\com\\cdi\\common\\appClasses.properties"));
		className = props.getProperty(lClassname);
		clazz = Class.forName(className);
		obj = clazz.newInstance();
		return obj;
	}
}
