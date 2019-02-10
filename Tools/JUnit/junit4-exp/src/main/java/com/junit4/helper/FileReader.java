package com.junit4.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.junit4.exception.EmptyOrNoFileException;
import com.junit4.exception.ReaderException;

public class FileReader implements Reader {

	@Override
	public String read(String location) {
		int c = 0;
		File inFile = null;
		FileInputStream inputStream = null;
		StringBuffer buffer = null;

		if (location == null || location.trim().length() == 0) {
			throw new EmptyOrNoFileException("FileName is empty");
		}
		inFile = new File(location);
		if (inFile.exists() == false) {
			throw new EmptyOrNoFileException("File is not found");
		}
		try {
			inputStream = new FileInputStream(inFile);
			buffer = new StringBuffer();
			while ((c = inputStream.read()) != -1) {
				buffer.append((char) c);
			}
			// create bug
			buffer = new StringBuffer();
		} catch (IOException e) {
			throw new ReaderException("failed to read the file", e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// eat
				}
			}
		}

		return buffer.toString();
	}

}
