package com.tigerlogistics.gateway.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FieldErrorResponse {

	private String field;
	private String message;
	
	}
