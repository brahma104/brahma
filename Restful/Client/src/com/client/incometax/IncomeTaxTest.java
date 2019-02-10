package com.client.incometax;

import java.util.concurrent.ExecutionException;

public class IncomeTaxTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		IncomeTaxInvoker itInvoker = new IncomeTaxInvoker();
		String taxForm = "<taxSheet><panNo>p939</panNo><totalIncome>9878</totalIncome><taxPaid>994</taxPaid></taxSheet>";
		
		/*String status = itInvoker.fileReturns(taxForm);
		System.out.println("status : " + status);*/
		
		itInvoker.fileReturnsCallback(taxForm);
		
		
	}

}
