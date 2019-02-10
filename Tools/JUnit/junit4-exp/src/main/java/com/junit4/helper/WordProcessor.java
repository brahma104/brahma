package com.junit4.helper;

public class WordProcessor {
	private Reader reader;

	public WordProcessor(Reader reader) {
		this.reader = reader;
	}

	public int wordCount(String location) {
		String data = null;
		int count = 0;

		data = reader.read(location);
		if (data == null || data.trim().length() == 0) {
			return 0;
		}
		count = data.split(" ").length;
		return count;
	}
}
