package com.tigerlogistics.gateway.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tigerlogistics.gateway.entity.User;
import com.tigerlogistics.gateway.exception.InvalidCredentialException;
import com.tigerlogistics.gateway.repository.UserRepository;

@Service
public class JwtUserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user= userRepository.findByUsername(username).orElseThrow(()-> new InvalidCredentialException("Username","User " + username + "doesn't exist" ));
		
		
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}

}
