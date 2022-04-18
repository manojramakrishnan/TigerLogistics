package com.tigerlogistics.auth.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.auth.dto.ForgetPasswordResponse;
import com.tigerlogistics.auth.dto.LoginRequest;
import com.tigerlogistics.auth.dto.LoginResponse;
import com.tigerlogistics.auth.service.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	@Autowired
	private AuthService authService;
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
		return ResponseEntity.status(HttpStatus.OK).body(authService.login(loginRequest));
	}
	@GetMapping("/forgotpassword/{username}")
	public ResponseEntity<Map<String,String>> forgetPassword(@PathVariable String username){
		return ResponseEntity.status(HttpStatus.OK).body(authService.fetchSecurityQuestionForUser(username));
	}
	

}
