package com.fj.helper;

public class DataHelper {

	public int getWordCount(String data) {
		int words = 0;

		words = data.split(" ").length;
		return words;
	}
}
