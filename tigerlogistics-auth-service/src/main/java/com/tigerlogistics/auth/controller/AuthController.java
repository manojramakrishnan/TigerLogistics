package com.tigerlogistics.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.auth.dto.LoginRequest;
import com.tigerlogistics.auth.dto.LoginResponse;
//import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;
import com.tigerlogistics.auth.service.AuthService;

@RestController
@RequestMapping("/login")
public class AuthController {
	@Autowired
	private AuthService authService;
	@PostMapping
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
		return ResponseEntity.status(HttpStatus.CREATED).body(authService.login(loginRequest));
			
	}
	

}
