package com.tigerlogistics.rawmaterial.order.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InvalidOrderUpdateStatusException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	  private String errorName;
	  private String errorDescription;

}
