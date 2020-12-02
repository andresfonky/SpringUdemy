package com.fonky.springdemo.exception;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 9012425312221103603L;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}

	public CustomerNotFoundException(Throwable cause) {
		super(cause);
	}

	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
