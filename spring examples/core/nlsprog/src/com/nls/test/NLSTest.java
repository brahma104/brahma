package com.nls.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class NLSTest {
	public static void main(String[] args) throws IOException {
		/*BufferedReader reader = null;
		String line = null;

		reader = new BufferedReader(
				new InputStreamReader(new FileInputStream("d:\\lang.txt"), Charset.forName("UTF-8")));
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();*/
		FileInputStream fis = new FileInputStream(new File("d:\\lang.txt"));
		int c = 0;
		StringBuffer buffer = new StringBuffer();
		while((c = fis.read()) != -1) {
			buffer.append((char) c);
		}
		fis.close();
		System.out.println(buffer.toString());
	}
}












