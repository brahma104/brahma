package com.junit4.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {
	private File inFile;
	private String expectedData;
	private Reader reader;

	@Before
	public void prepare() throws IOException {
		FileOutputStream fos = null;

		reader = new FileReader();
		expectedData = "This is Junit3";
		try {
			inFile = new File("d:\\test.txt");
			fos = new FileOutputStream(inFile);
			fos.write(expectedData.getBytes());
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}

	@Test
	public void testRead() {
		String actualData = null;

		actualData = reader.read("d:\\test.txt");
		Assert.assertEquals(expectedData, actualData);
	}

	@After
	public void clean() {
		inFile.delete();
	}
}
