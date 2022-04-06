package com.tigerlogistics.auth.exception;

public class InvalidCredentialException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	  private String errorName;
	  private String errorDescription;
	public InvalidCredentialException(String errorName, String errorDescription) {
		super();
		this.errorName = errorName;
		this.errorDescription = errorDescription;
	}

}
