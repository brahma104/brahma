package com.apollostore.util;

public class ValidatorUtil {
	public static boolean isEmpty(String s) {
		if (s == null || s.trim().length() <= 0) {
			return true;
		}
		return false;
	}
}
