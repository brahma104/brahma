package com.singleton.test;

import java.util.Calendar;

import com.singleton.li.pattern.Worker;

public class MultiQuickTransfer {
	public static void main(String[] args) throws InterruptedException {
		Worker worker = new Worker();
		long st = Calendar.getInstance().getTimeInMillis();
		for (int i = 0; i < 40; i++) {
			Thread t = new Thread(worker);
			t.start();
			t.join();
		}
		//Thread.currentThread().join();
		System.out.println("thread finished");
		long et = Calendar.getInstance().getTimeInMillis();
		System.out.println("total : " +(et - st));
	}
}
