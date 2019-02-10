package com.uv.helper;

public class SortArray {
	public int[] sort(int[] in) {
		int tmp = 0;

		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < (in.length - i - 1); j++) {
				if (in[j] > in[j + 1]) {
					tmp = in[j];
					in[j] = in[j + 1];
					in[j + 1] = tmp;
				}
			}
		}
		return in;
	}
}
