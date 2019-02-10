package com.fj.accessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReader {
	public String getData(String inFile) throws IOException {
		int c = 0;
		File file = null;
		StringBuffer buffer = null;
		FileInputStream fis = null;

		try {
			buffer = new StringBuffer();
			file = new File(inFile);
			fis = new FileInputStream(file);
			while ((c = fis.read()) != -1) {
				buffer.append((char) c);
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
		return buffer.toString();
	}
}
