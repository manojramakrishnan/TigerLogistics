package com.tigerlogistics.main.model;

import java.io.Serializable;

public class EditValidation implements Serializable {

	private static final long serialVersionUID = 1L;
	private String fieldName;
	private String validationMessage;
	private EditValidationSeverity severity = EditValidationSeverity.LOW;

	public EditValidation(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	public EditValidation(String validationMessage, EditValidationSeverity severity) {
		this.validationMessage = validationMessage;
		this.severity = severity;
	}

	public EditValidation(String fieldName, String validationMessage, EditValidationSeverity severity) {
		this.fieldName = fieldName;
		this.validationMessage = validationMessage;
		this.severity = severity;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getValidationMessage() {
		return validationMessage;
	}

	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	public EditValidationSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(EditValidationSeverity severity) {
		this.severity = severity;
	}

	public static enum EditValidationSeverity {
		LOW, MEDIUM, CRITICAL
	}

}
