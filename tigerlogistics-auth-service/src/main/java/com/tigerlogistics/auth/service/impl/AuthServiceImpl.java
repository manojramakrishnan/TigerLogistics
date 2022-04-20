package com.tigerlogistics.auth.service.impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tigerlogistics.auth.dto.ForgetPasswordRequest;
import com.tigerlogistics.auth.dto.ForgetPasswordResponse;
import com.tigerlogistics.auth.dto.LoginRequest;
import com.tigerlogistics.auth.dto.LoginResponse;
import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;
import com.tigerlogistics.auth.entity.User;
import com.tigerlogistics.auth.entity.UserDetails;
import com.tigerlogistics.auth.exception.InvalidCredentialException;
import com.tigerlogistics.auth.helper.UserDetailMapper;
import com.tigerlogistics.auth.repository.AddressRepository;
import com.tigerlogistics.auth.repository.UserDetailsRepository;
import com.tigerlogistics.auth.repository.UserRepository;
import com.tigerlogistics.auth.security.JwtProvider;
import com.tigerlogistics.auth.service.AuthService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class AuthServiceImpl implements AuthService {
	@Autowired
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	private JwtProvider jwtProvider;

	
 
	@Override
	public UserDetailsDTO register(RegisterRequest registerRequest) {
		
		checkIfUsernameExists(registerRequest.getUsername());
		registerRequest.setPassword(encodePassword(registerRequest.getPassword()));
		registerRequest.setAddress((addressRepository.save(registerRequest.getAddress())));
		UserDetails userDetails=new UserDetails();
		UserDetailMapper userDetailMapper=new UserDetailMapper();
		userDetails=userDetailMapper.registeredToUserdetails(registerRequest);
		UserDetails userDetails1=userDetailsRepository.save(userDetails);
		return UserDetailMapper.userDetailsToDto(userDetails1);
	}

	private String encodePassword(String password) {
		
		
		return passwordEncoder.encode(password);
	}

	private boolean checkIfUsernameExists(String username) {
		
		if(!userRepository.existsByUsername(username)) return false;
		else throw new InvalidCredentialException("username","Username exists"); 
		
			
		
		
	}
	public LoginResponse login(LoginRequest loginRequest) {
		User user=findByUserCredentials(loginRequest.getUsername(),loginRequest.getPassword());
		
		return LoginResponse.builder().userId(user.getUserId()).userName(user.getUsername()).role(user.getRole()).token(jwtProvider.generateTokenWithUsername(user.getUsername())).build();
	}

	private User findByUserCredentials(String username, String password) {
		User user=userRepository.findByUsername(username);
		if (user!=null) {
			
		}
				else throw  new InvalidCredentialException("usename","User" +username + "doesn't exist");
		if(!passwordEncoder.matches(password, user.getPassword())) throw new InvalidCredentialException("password","invalid password");
		return user;
	}

	@Override
	public Map<String, String> fetchSecurityQuestionForUser(String username) {
		// TODO Auto-generated method stub
		HashMap<String, String> responseMap = new HashMap<String, String>();
		responseMap.put("username", username);
		User user=userRepository.findByUsername(username);
		UserDetails userDetails = userDetailsRepository.findByUserDetailsId(user.getUserId());
		if (userDetails != null && userDetails.getSecurityQuestion() != null) {
			responseMap.put("securityquestion", userDetails.getSecurityQuestion());
		} else {
			throw new InvalidCredentialException("username", "User" + username + "doesn't exist");
		}
		return responseMap;
	}

	@Override
	public Map<String,String> validateAnswerAndUpdate(ForgetPasswordRequest forgetPasswordRequest) {
		User user1=userRepository.findByUsername(forgetPasswordRequest.getUsername());
		UserDetails userDetails = userDetailsRepository.findByUserDetailsId(user1.getUserId());
		//UserDetails userDetails = userDetailsRepository.findByUserName(forgetPasswordRequest.getUsername());
		if(userDetails != null && userDetails.getSecurityAnswer() != null) {
			if(userDetails.getSecurityAnswer().equalsIgnoreCase(forgetPasswordRequest.getSecurityanswer())) {
				User user=userDetails.getUser();
				user.setPassword(encodePassword(forgetPasswordRequest.getNewpassword()));
				userRepository.save(user);
			}
			else {
				throw new InvalidCredentialException("securityanswer","InvalidAnswer");
			}
			
		}
		else {
			throw new InvalidCredentialException("username","user"+forgetPasswordRequest.getUsername()+"doesn't exist");
		}
		
		return Collections.singletonMap("userId", userDetails.getUserDetailsId().toString());
		
	}
	

}