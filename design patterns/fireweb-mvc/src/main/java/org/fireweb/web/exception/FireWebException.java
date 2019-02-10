package org.fireweb.web.exception;

public class FireWebException extends RuntimeException {

	public FireWebException() {
		super();
	}

	public FireWebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FireWebException(String message, Throwable cause) {
		super(message, cause);
	}

	public FireWebException(String message) {
		super(message);
	}

	public FireWebException(Throwable cause) {
		super(cause);
	}

}
