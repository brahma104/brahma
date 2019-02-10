package org.fireweb.web.exception;

public class HandlerInstantiationFailedException extends FireWebException {

	public HandlerInstantiationFailedException() {
		super();
	}

	public HandlerInstantiationFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HandlerInstantiationFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public HandlerInstantiationFailedException(String message) {
		super(message);
	}

	public HandlerInstantiationFailedException(Throwable cause) {
		super(cause);
	}

}
