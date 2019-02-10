package com.em.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.em.dto.Error;
import com.em.exception.AccountNotFoundException;

@Provider
public class AccountNotFoundExceptionMapper implements ExceptionMapper<AccountNotFoundException> {

	@Override
	public Response toResponse(AccountNotFoundException e) {
		System.out.println("toResponse()");
		Error error = new Error();
		error.setId("0003");
		error.setCause("Resource not found Error");
		error.setErrorType("Bad Data");

		return Response.status(Status.BAD_REQUEST).entity(error).build();
	}

}
