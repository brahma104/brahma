package com.ji.it.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/account/{accountNo}")
public class AccountService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/balance")
	public float getAccountBalance(@PathParam("accountNo") String accountNo) {
		return 33.34f;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/type")
	public String getAccountType(@PathParam("accountNo") String accountNo) {
		return "savings";
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/transfer/{accountNo}/{amount}")
	public String transfer(@PathParam("accountNo") String fromAccount, @PathParam("accountNo") String toAccount,
			@PathParam("amount") float amount) {
		return "fromAc : " + fromAccount + " toAccount : " + toAccount + " amount : " + amount;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/neft/{transactionNo:\\d+}/status")
	public String neftStatus(@PathParam("accountNo") String accountNo, @PathParam("transactionNo") int transactionNo) {
		return "accountNo : " + accountNo + " transactionNo : " + transactionNo;
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/apply/{loanType}:{principle}:{tenure}")
	public String applyLoan(@PathParam("accountNo") String accountNo, @PathParam("loanType") String loanType,
			@PathParam("principle") long principle, @PathParam("tenure") int tenure) {
		return "accountNo : " + accountNo + " loanType : " + loanType + " principle : " + principle + " tenure : "
				+ tenure;
	}

}















