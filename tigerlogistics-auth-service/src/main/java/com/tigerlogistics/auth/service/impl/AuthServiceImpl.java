package com.tigerlogistics.auth.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tigerlogistics.auth.dto.LoginRequest;
import com.tigerlogistics.auth.dto.LoginResponse;
//import com.tigerlogistics.auth.dto.LoginResponse;
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
@Service
public class AuthServiceImpl implements AuthService {
	@Autowired
	private UserRepository userRepository;
	
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Autowired
	private JwtProvider jwtProvider;

	
 
	@Override
	public UserDetailsDTO register(RegisterRequest registerRequest) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		
		return passwordEncoder.encode(password);
	}

	private boolean checkIfUsernameExists(String username) {
		// TODO Auto-generated method stub
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
	
	

}
