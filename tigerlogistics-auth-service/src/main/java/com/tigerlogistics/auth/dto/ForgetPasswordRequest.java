package com.tigerlogistics.auth.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ForgetPasswordRequest {
	private String username;
	private String securityanswer;
	private String newpassword;

}
