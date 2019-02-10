package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.DiscountAdvice;
import com.ara.beans.RewardCard;
import com.ara.beans.SaleManager;

public class BillAdviceTest {
	public static void main(String[] args) {
		SaleManager saleManager = new SaleManager();
		DiscountAdvice discountAdvice = new DiscountAdvice();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(saleManager);
		pf.addAdvice(discountAdvice);
		SaleManager proxy = (SaleManager) pf.getProxy();
		RewardCard card = new RewardCard();
		card.setCardNo("39495");
		card.setMemberType("silver");
		card.setMobileNo("939484");
		double bill = proxy.bill(null, card);
		System.out.println("bill : " + bill);
	}
}
