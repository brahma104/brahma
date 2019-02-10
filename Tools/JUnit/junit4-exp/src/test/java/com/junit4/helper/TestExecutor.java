package com.junit4.helper;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestExecutor {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ArrayHelperTest.class);
		if (result.wasSuccessful() == false) {
			List<Failure> failures = result.getFailures();
			for(Failure failure : failures) {
				System.out.println(failure.getTestHeader() + " : " + failure.getMessage());
			}
		}
		System.out.println("Total Run : " + result.getRunCount() + " , Failed : " + result.getFailureCount());
	}

}
