package com.so.test;

import com.so.helper.FindElementInArray;

public class FindElementTest {
	public static void main(String[] args) {
		FindElementInArray feia = new FindElementInArray();
		int pos = feia.find(new int[] { 1, 3, 11, 6, 10, 34, 23 }, 10);
		System.out.println("position found : " + pos);
	}
}
