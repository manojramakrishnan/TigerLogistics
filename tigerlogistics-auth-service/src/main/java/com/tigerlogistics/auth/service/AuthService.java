package com.tigerlogistics.auth.service;

import com.tigerlogistics.auth.dto.LoginRequest;
import com.tigerlogistics.auth.dto.LoginResponse;
import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;

public interface AuthService {

	UserDetailsDTO register(RegisterRequest registerRequest);
	LoginResponse login(LoginRequest loginRequest);

}
