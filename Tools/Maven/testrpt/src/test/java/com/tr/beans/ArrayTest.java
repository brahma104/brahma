package com.tr.beans;

import junit.framework.Assert;

public class ArrayTest {

	public void testElementFound() {
		Array array = null;
		int[] in = new int[] { 4, 2, 1, 10, 5 };
		int elem = 1;
		int expectedPos = 2;
		int actualPos = 0;
		
		array = new Array();
		actualPos = array.find(in, elem);
		Assert.assertEquals(expectedPos, actualPos);
		

	}
}
