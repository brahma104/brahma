package com.junit4.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class WordProcessorTest {
	private File inFile;
	private int expectedCount;
	private String data;
	private WordProcessor wordProcessor;
	private Reader reader;

	@Before
	public void prepare() throws IOException {
		FileOutputStream fos = null;

		data = "This is Junit3";
		expectedCount = 3;
		reader = mock(Reader.class);
		when(reader.read("d:\\test.txt")).thenReturn("This is Junit3");

		wordProcessor = new WordProcessor(reader);
		try {
			inFile = new File("d:\\test.txt");
			fos = new FileOutputStream(inFile);
			fos.write(data.getBytes());
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}

	@Test
	public void testWordCount() {
		int actualCount = 0;
		actualCount = wordProcessor.wordCount("d:\\test.txt");
		Assert.assertEquals(expectedCount, actualCount);
	}

	@After
	public void clean() {
		inFile.delete();
	}

}
