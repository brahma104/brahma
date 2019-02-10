package org.fireweb.web2.exception;

public class Fireweb2Exception extends RuntimeException {

	public Fireweb2Exception() {
		super();
	}

	public Fireweb2Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public Fireweb2Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public Fireweb2Exception(String message) {
		super(message);
	}

	public Fireweb2Exception(Throwable cause) {
		super(cause);
	}

}
