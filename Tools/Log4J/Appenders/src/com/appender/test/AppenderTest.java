package com.appender.test;

import org.apache.log4j.Logger;

import com.appender.helper.BankService;

public class AppenderTest {
	public static void main(String[] args) {
		/*Logger logger = Logger.getLogger(AppenderTest.class);
		logger.info("Multi appender");
		logger.info("new Line");*/
		BankService bs = new BankService();
		bs.transfer("ac93", "39", 34);
	}
}
