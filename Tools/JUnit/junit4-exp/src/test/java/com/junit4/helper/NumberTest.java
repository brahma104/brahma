package com.junit4.helper;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumberTest {
	private int n;
	private boolean expected;
	private Number number;

	public NumberTest(int n, boolean expected) {
		this.n = n;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> getParameters() {
		return Arrays.asList(new Object[][] { { -1, false }, { 0, false }, { 1, true }, { 2, true }, { 3, true },
				{ 4, false }, { 9, false } });
	}

	@Before
	public void prepare() {
		number = new Number();
	}

	@Test
	public void testIsPrime() {
		boolean actual = false;
		actual = number.isPrime(n);
		Assert.assertEquals(actual, expected);
	}

}
