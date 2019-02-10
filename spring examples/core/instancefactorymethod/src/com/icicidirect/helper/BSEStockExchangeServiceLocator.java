package com.icicidirect.helper;

import com.bsestockexchange.service.StockManager;
import com.bsestockexchange.service.StockManagerImpl;

public class BSEStockExchangeServiceLocator {
	public StockManager locateStockManager() {
		// lookup logic & jndi lookup as we dont have other class
		return new StockManagerImpl();
	}
}
