package com.tm.exception;

public class LoanEligibilityFailedException extends LoanException {

	public LoanEligibilityFailedException() {
		super();
	}

	public LoanEligibilityFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoanEligibilityFailedException(String message) {
		super(message);
	}

	public LoanEligibilityFailedException(Throwable cause) {
		super(cause);
	}

}
