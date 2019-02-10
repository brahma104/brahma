package com.client.netbanking;

public class NetBankingTest {
	public static void main(String[] args) {
		Application application = new  Application();
		application.setApplicantName("Adrew");
		application.setAccountType("savings");
		application.setMobileNo("3930440");
		application.setEmailAddress("adrew@gmail.com");
		application.setStreetAddress("main road");
		application.setCity("hyderabad");
		application.setState("TS");
		application.setZip(39404);
		application.setCountry("India");
		
		NetbankingInvoker nbInvoker = new NetbankingInvoker();
		Account account = nbInvoker.openAccount(application);
		System.out.println(account.getAccountNo());
	}

}
