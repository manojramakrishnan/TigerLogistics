package com.tigerlogistics.auth.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tigerlogistics.auth.dto.AllUsers;
import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;
import com.tigerlogistics.auth.service.AuthService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private AuthService authService;
	@PostMapping
	public ResponseEntity<UserDetailsDTO> register(@RequestBody RegisterRequest registerRequest){
	
			return ResponseEntity.status(HttpStatus.CREATED).body(authService.register(registerRequest));
	}
    @GetMapping("/fetchallusers")
    public ResponseEntity<List<UserDetailsDTO>> fetchAllUsers(){
		return ResponseEntity.status(HttpStatus.OK).body(authService.fetchAllUsers()); 
    	
    }
	
}
