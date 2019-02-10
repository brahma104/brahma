package com.bl.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BLTest {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger logger = Logger.getLogger(BLTest.class);
		logger.info("this is basic logging");
	}
}
