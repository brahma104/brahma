package com.junit4.helper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.junit4.exception.EmptyArrayException;

public class ArrayHelperTest {
	private ArrayHelper arrayHelper;
	private int[] in;
	private int[] expectedAscSortedArray;
	private int[] expectedDescSortedArray;
	private int[] empty;
	private int[] expectedEmptyArray;
	private int[] negatives;
	private int[] expectedNegativeSortedAscArray;
	private int[] oneElement;
	private int[] expectedOneElement;

	@Before
	public void prepare() {
		arrayHelper = new ArrayHelper();
		in = new int[] { 23, 12, 56, 25, 9 };
		empty = new int[0];
		expectedAscSortedArray = new int[] { 9, 12, 23, 25, 56 };
		expectedDescSortedArray = new int[] { 56, 25, 23, 12, 9 };
		expectedEmptyArray = new int[0];
		negatives = new int[] { -100, -30, -9, -90, -12 };
		expectedNegativeSortedAscArray = new int[] { -100, -90, -30, -12, -9 };
		oneElement = new int[] { 12 };
		expectedOneElement = new int[] { 12 };
	}

	@Test
	public void testSortForAscOrder() {
		int[] actualSortedArray = null;

		actualSortedArray = arrayHelper.sort(in, SortOrder.ASC);
		Assert.assertArrayEquals(expectedAscSortedArray, actualSortedArray);
	}

	@Test
	@Ignore
	public void testSortForDescOrder() {
		int[] actualSortedArray = null;
		actualSortedArray = arrayHelper.sort(in, SortOrder.DESC);
		Assert.assertArrayEquals(expectedDescSortedArray, actualSortedArray);
	}

	@Test
	public void testSortEmptyArray() {
		int[] actualSortedArray = null;

		actualSortedArray = arrayHelper.sort(empty, SortOrder.ASC);
		Assert.assertArrayEquals(expectedEmptyArray, actualSortedArray);
	}

	@Test
	public void testSortNegativeAscOrder() {
		int[] actualSortedArray = null;
		actualSortedArray = arrayHelper.sort(negatives, SortOrder.ASC);
		Assert.assertArrayEquals(expectedNegativeSortedAscArray, actualSortedArray);
	}

	@Test(timeout = 1)
	public void testSortWithOneElement() {
		int[] actualSortedArray = null;
		actualSortedArray = arrayHelper.sort(oneElement, SortOrder.ASC);
		Assert.assertArrayEquals(expectedOneElement, actualSortedArray);
	}

	@Test(expected = EmptyArrayException.class)
	public void testSortNullArray() {
		arrayHelper.sort(null, SortOrder.ASC);
	}

	@After
	public void clean() {
		arrayHelper = null;
	}
}
