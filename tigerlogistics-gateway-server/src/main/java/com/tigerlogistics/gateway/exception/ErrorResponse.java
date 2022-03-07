package com.tigerlogistics.gateway.exception;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorResponse {

	private int status;
	private String message;
	private long timeStamp;
	private List<FieldErrorResponse> errors;
	
	
	
}
