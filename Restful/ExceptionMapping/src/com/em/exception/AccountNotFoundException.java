package com.em.exception;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountNotFoundException(String message) {
		super(message);
	}

}
