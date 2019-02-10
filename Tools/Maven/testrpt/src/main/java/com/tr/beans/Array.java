package com.tr.beans;

public class Array {
	public int find(int[] in, int elem) {
		int pos = -1;

		for (int i = 0; i < in.length; i++) {
			if (in[i] == elem) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	private void noUse() {}
}

