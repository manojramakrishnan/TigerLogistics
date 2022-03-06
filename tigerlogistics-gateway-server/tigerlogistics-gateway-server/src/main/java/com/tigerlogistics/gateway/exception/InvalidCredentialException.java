package com.tigerlogistics.gateway.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class InvalidCredentialException extends RuntimeException {
	
	private static final long serialVersionUID= 1L;
	private String errorName;
	private String errorDescription;
	
	
}
