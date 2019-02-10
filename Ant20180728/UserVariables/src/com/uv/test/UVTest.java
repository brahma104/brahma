package com.uv.test;

import com.uv.helper.SortArray;

public class UVTest {
	public static void main(String[] args) {
		SortArray sa = new SortArray();
		int[] sortedArray = sa.sort(new int[] { 10, 4, 14, 6, 1, 8 });
		for(int e : sortedArray) {
			System.out.print(e +" ");
		}
	}
}
