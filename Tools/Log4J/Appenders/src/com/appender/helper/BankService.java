package com.appender.helper;

import java.util.UUID;

import com.appender.logger.MyLogger;

//import org.apache.log4j.Logger;

public class BankService {
	//private final static Logger logger = Logger.getLogger(BankService.class);
	private final static MyLogger logger = MyLogger.getLogger(BankService.class);

	public String transfer(String fromAccount, String toAccount, float amount) {
		logger.debug("fromAccount : " + fromAccount + " toAccount : " + toAccount + " amount : " + amount);
		return UUID.randomUUID().toString();
	}

	public float getBalance(String accountNo) {
		logger.debug("accountNo : " + accountNo);
		return 3934.34f;
	}
}
