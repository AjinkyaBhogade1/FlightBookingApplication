package com.flightbook.exception;

public class InvalidInputException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6113091732692530619L;
	private String message;

	public InvalidInputException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
