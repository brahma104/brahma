package com.sat.accessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReader {

	public String getData(File file) throws IOException {
		int c = 0;
		StringBuffer buffer = null;
		FileInputStream fis = null;

		buffer = new StringBuffer();
		fis = new FileInputStream(file);

		while ((c = fis.read()) != -1) {
			buffer.append((char) c);
		}
		fis.close();
		return buffer.toString();
	}

}













