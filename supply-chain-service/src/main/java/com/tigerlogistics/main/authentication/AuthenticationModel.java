package com.tigerlogistics.main.authentication;

import java.io.Serializable;

public class AuthenticationModel implements Serializable {

	private static final long	serialVersionUID	= 1L;
	private String	token;
	
	
	public AuthenticationModel() {	}

	
	public AuthenticationModel(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}
		
	public void setToken(String token) {
		this.token = token;
	} 

}
