package com.junit4.exception;

public class EmptyOrNoFileException extends ReaderException {

	public EmptyOrNoFileException() {
		super();
	}

	public EmptyOrNoFileException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmptyOrNoFileException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmptyOrNoFileException(String message) {
		super(message);
	}

	public EmptyOrNoFileException(Throwable cause) {
		super(cause);
	}

}
