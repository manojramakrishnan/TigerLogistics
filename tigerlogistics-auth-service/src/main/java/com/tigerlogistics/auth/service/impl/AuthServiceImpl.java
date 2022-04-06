package com.tigerlogistics.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;
import com.tigerlogistics.auth.entity.UserDetails;
import com.tigerlogistics.auth.exception.InvalidCredentialException;
import com.tigerlogistics.auth.helper.UserDetailMapper;
import com.tigerlogistics.auth.repository.AddressRepository;
import com.tigerlogistics.auth.repository.UserDetailsRepository;
import com.tigerlogistics.auth.repository.UserRepository;
import com.tigerlogistics.auth.service.AuthService;
@Service
public class AuthServiceImpl implements AuthService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private UserDetailsRepository userDetailsRepository;

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
	

}