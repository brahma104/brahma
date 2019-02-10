package com.icicidirect.handler;

import com.bsestockexchange.service.StockManager;

public class StockHandler {
	private StockManager stockManager;

	public void showStockPrice(String stockName) {
		float stockPrice = 0.0f;

		stockPrice = stockManager.getStockPrice(stockName);
		System.out.println("price : " + stockPrice);
	}

	public void setStockManager(StockManager stockManager) {
		this.stockManager = stockManager;
	}

}
