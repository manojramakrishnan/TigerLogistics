package com.tigerlogistics.auth.service;

import java.util.List;
import java.util.Map;

import com.tigerlogistics.auth.dto.AllUsers;
import com.tigerlogistics.auth.dto.ForgetPasswordRequest;
import com.tigerlogistics.auth.dto.ForgetPasswordResponse;
import com.tigerlogistics.auth.dto.LoginRequest;
import com.tigerlogistics.auth.dto.LoginResponse;
import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;

public interface AuthService {

	UserDetailsDTO register(RegisterRequest registerRequest);
	LoginResponse login(LoginRequest loginRequest);
	Map<String,String> fetchSecurityQuestionForUser(String username);
	Map<String,String> validateAnswerAndUpdate(ForgetPasswordRequest forgetPasswordRequest);
	List<UserDetailsDTO> fetchAllUsers();
	UserDetailsDTO fetchUsersById(long userId);
	

}
