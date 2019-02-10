package com.cch.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cch.dto.Account;
import com.cch.dto.Application;

@Path("/netbanking")
public class NetbankingService {

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Account openAccount(Application application) {
		// insert the application into database
		Account account = null;

		account = new Account();
		account.setAccountNo(application.getMobileNo() + "-AC");
		account.setAccountHolderName(application.getApplicantName());
		account.setAccountType(application.getAccountType());
		account.setBranch("B0393");
		account.setBalance(500);
		return account;
	}
}
