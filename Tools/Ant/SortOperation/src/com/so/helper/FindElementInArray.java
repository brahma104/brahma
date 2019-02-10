package com.so.helper;

public class FindElementInArray {
	public int find(int[] in, int elem) {
		int pos = -1;

		if (in.length > 0) {
			for (int i = 0; i < in.length; i++) {
				if (in[i] == elem) {
					pos = i;
					break;
				}
			}
		}
		return pos;
	}
}
