package com.action;

public class SecurityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2954016499735996173L;
	
	private String message;
	
	public SecurityException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
