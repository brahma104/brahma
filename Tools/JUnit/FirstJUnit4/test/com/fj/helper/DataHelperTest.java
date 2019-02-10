package com.fj.helper;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DataHelperTest {
	private String inData;
	private int expectedWords;
	private DataHelper dataHelper;

	@Before
	public void fixuture() {
		inData = "This is JUnit Testing";
		expectedWords = 4;
		dataHelper = new DataHelper();
	}
	
	@Test
	public void testGetWordCount() {
		int actualWords = 0;
		
		actualWords = dataHelper.getWordCount(inData);
		assertEquals(expectedWords, actualWords);
	}

	@After
	public void release() {
		dataHelper = null;
	}

}















