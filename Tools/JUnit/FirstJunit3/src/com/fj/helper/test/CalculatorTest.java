package com.fj.helper.test;

import com.fj.helper.Calculator;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	public void testAdd() throws Exception {
		int a = 10;
		int b = 20;
		int expectedSum = 30;
		int actualSum = 0;
		Calculator calculator  = null;
		
		calculator = new Calculator();
		actualSum = calculator.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}

	public void testMultiply() {
		int a = 10;
		int b = 20;
		int expectedMultiply = 300;
		int actualMultiply = 0;
		Calculator calculator = null;
		
		calculator = new Calculator();
		actualMultiply = calculator.multiply(a, b);
		Assert.assertEquals(expectedMultiply, actualMultiply);
		
	}
	
}



















