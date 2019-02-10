package com.tm.exception;

public class LoanException extends RuntimeException {

	public LoanException() {
		super();
	}

	public LoanException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoanException(String message) {
		super(message);
	}

	public LoanException(Throwable cause) {
		super(cause);
	}

}
