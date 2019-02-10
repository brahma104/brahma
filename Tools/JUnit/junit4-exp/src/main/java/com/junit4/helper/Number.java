package com.junit4.helper;

public class Number {

	public boolean isPrime(int n) {
		boolean prime = true;

		if (n <= 0) {
			return false;
		}

		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
