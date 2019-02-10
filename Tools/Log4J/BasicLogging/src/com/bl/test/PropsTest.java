package com.bl.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropsTest {
	public static void main(String[] args) {
		//PropertyConfigurator.configure(PropsTest.class.getClassLoader().getResource("com/bl/test/log4j.properties"));
		Logger logger = Logger.getLogger(PropsTest.class);
		logger.info("this is properties");

	}
}
