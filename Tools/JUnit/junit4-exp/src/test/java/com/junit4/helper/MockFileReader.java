package com.junit4.helper;

public class MockFileReader implements Reader {

	@Override
	public String read(String location) {
		if (location != null && location.trim().length() > 0) {
			if (location.equals("d:\\test.txt")) {
				return "This is Junit3";
			}
		}
		return null;
	}

}
