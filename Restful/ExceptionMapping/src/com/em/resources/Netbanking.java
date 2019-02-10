package com.em.resources;


import javax.ws.rs.GET;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.em.dto.Account;
import com.em.dto.Error;
import com.em.exception.AccountNotFoundException;

@Path("/netbanking")
public class Netbanking {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/account/{accountNo}")
	public Response getAccount(@PathParam("accountNo") String accountNo) {
		Account account = null;

		try {
			// virutal creating exception
			if (accountNo.equals("ac00001")) {
				throw new Exception("account not found");
			}

			account = new Account();
			account.setAccountNo(accountNo);
			account.setAccountHolderName("Williams");
			account.setAccountType("savings");
			account.setBalance(303.34f);
		} catch (Exception e) {
			throw new AccountNotFoundException("account not found", e);
		}
		return Response.ok(account).build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/account/{accountNo}/balance")
	public double getAccountBalance(@PathParam("accountNo") String accountNo) {

		try {
			if (accountNo.equals("ac00001")) {
				throw new Exception("account not found");
			}
		} catch (Exception e) {
			throw new AccountNotFoundException("account not found", e);
		}
		return 393.34f;
	}

}
