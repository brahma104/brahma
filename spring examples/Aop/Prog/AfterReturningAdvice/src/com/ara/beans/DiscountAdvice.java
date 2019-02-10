package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method method, Object[] args, Object target) throws Throwable {
		double billAmount = 0;
		RewardCard rewardCard = null;

		billAmount = (Double) ret;
		rewardCard = (RewardCard) args[1];

		if (rewardCard.getMemberType().equals("silver") && billAmount >= 5000) {
			System.out.println(
					"Congratulations! You have availed a discount of 10% of an maximum amount of 500 you can use this in next purchase and coupon : cp500");
		} else if (rewardCard.getMemberType().equals("gold") && billAmount >= 3000) {
			System.out.println(
					"Congratulations! You have availed a discount of 15% of an maximum amount of 450 you can use this in next purchase and coupon : cp450");
		} else if (rewardCard.getMemberType().equals("platinum") && billAmount >= 2000) {
			System.out.println(
					"Congratulations! You have availed a discount of 20% of an maximum amount of 400 you can use this in next purchase and coupon : cp400");
		}
	}

}
