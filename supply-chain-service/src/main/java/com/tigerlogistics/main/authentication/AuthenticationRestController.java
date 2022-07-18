package com.tigerlogistics.main.authentication;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "rest/authenticate")
public class AuthenticationRestController {
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json; charset=UTF-8",
			consumes = "application/json; charset=UTF-8")
	public AuthenticationModel authenticate(String userName, String password){
		// TODO: Generate JWT.
		return new AuthenticationModel("TEST TOKEN");
	}

}
