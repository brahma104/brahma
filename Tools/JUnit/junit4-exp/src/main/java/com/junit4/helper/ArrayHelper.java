package com.junit4.helper;

import com.junit4.exception.EmptyArrayException;

public class ArrayHelper {

	public int[] sort(int[] in, SortOrder sortOrder) {
		int t = 0;
		int sort[] = null;
		Compare compare = null;

		if (in == null) {
			throw new EmptyArrayException("array is empty, cannot sort");
		}

		sort = new int[in.length];
		// copy array
		for (int i = 0; i < in.length; i++) {
			sort[i] = in[i];
		}
		if (sortOrder.equals(SortOrder.ASC)) {
			compare = new AscCompare();
		} else {
			compare = new DescCompare();
		}

		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = 0; j < (sort.length - 1 - i); j++) {
				if (compare.compare(sort[j], sort[j + 1]) == false) {
					t = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = t;
				}
			}
		}
		return sort;
	}

	private interface Compare {
		boolean compare(int in1, int in2);
	}

	private final class AscCompare implements Compare {

		@Override
		public boolean compare(int in1, int in2) {
			if (in1 > in2) {
				return false;
			}
			return true;
		}

	}

	private final class DescCompare implements Compare {

		@Override
		public boolean compare(int in1, int in2) {
			if (in1 < in2) {
				return false;
			}
			return true;
		}

	}
}
