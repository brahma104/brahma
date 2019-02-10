package com.appender.logger;

import org.apache.log4j.Logger;

public class MyLogger {
	private Logger logger;

	public static MyLogger getLogger(Class<?> classType) {
		MyLogger myLogger = null;
		myLogger = new MyLogger();
		myLogger.logger = Logger.getLogger(classType);
		return myLogger;
	}

	public void info(String message) {
		logger.info(message);
	}

	public void debug(String message) {
		logger.debug(message);
	}

	public void warn(String message) {
		logger.warn(message);
	}
}
