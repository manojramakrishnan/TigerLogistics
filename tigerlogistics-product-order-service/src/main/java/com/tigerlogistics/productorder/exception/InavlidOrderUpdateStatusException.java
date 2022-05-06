package com.tigerlogistics.productorder.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InavlidOrderUpdateStatusException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	  private String errorName;
	  private String errorDescription;
}
