package com.tigerlogistics.auth.helper;

import com.tigerlogistics.auth.dto.RegisterRequest;
import com.tigerlogistics.auth.dto.UserDetailsDTO;
import com.tigerlogistics.auth.entity.User;
import com.tigerlogistics.auth.entity.UserDetails;

public class UserDetailMapper {

	public UserDetails registeredToUserdetails(RegisterRequest registerRequest) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setUsername(registerRequest.getUsername());
		user.setPassword(registerRequest.getPassword());
		user.setRole("user");
		UserDetails userDetails=new UserDetails();
		userDetails.setUser(user);
		userDetails.setAddress(registerRequest.getAddress());
		userDetails.setDesignation(registerRequest.getDesignation());
		userDetails.setDob(registerRequest.getDob());
		userDetails.setGender(registerRequest.getGender());
		userDetails.setEmailId(registerRequest.getEmailId());
		userDetails.setFirstName(registerRequest.getFirstName());
		userDetails.setLastName(registerRequest.getLastName());
		userDetails.setPhoneNo(registerRequest.getPhoneNo());
		userDetails.setSecurityQuestion("Question");
		userDetails.setSecurityAnswer("Answer");
		return userDetails;
		
	}

	public static UserDetailsDTO userDetailsToDto(UserDetails userDetails) {
		// TODO Auto-generated method stub
		
		return UserDetailsDTO.builder().userId(userDetails.getUserDetailsId()).username(userDetails.getUser().getUsername()).role(userDetails.getUser().getRole()).
				designation(userDetails.getDesignation()).gender(userDetails.getGender()).emailId(userDetails.getEmailId()).dob(userDetails.getDob())
				.address(userDetails.getAddress()).phoneNo(userDetails.getPhoneNo()).firstName(userDetails.getFirstName()).lastName(userDetails.getLastName()).build();
		
	}

}
