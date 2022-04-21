package com.tigerlogistics.auth.dto;

import java.time.LocalDate;

import com.tigerlogistics.auth.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsDTO {
	private Long userId;
	private String role;
	private String username;
	private String designation;
	private String gender;
	private String emailId;
	private String phoneNo;
	private LocalDate dob;
	private Address address;
	private String firstName;
	private String lastName;
	

}
