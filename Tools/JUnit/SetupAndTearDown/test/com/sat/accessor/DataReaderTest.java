package com.sat.accessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DataReaderTest extends TestCase {
	private File inFile;
	private String expectedData;
	private DataReader dataReader;

	@Override
	protected void setUp() throws Exception {
		FileOutputStream fos = null;
		
		dataReader = new DataReader();
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
	
	public void testGetData() throws IOException {
		String actualData = null;
		
		actualData = dataReader.getData(inFile);
		Assert.assertEquals(expectedData, actualData);
	}

	@Override
	protected void tearDown() throws Exception {
		if (inFile != null) {
			inFile.delete();
		}
	}

}



















