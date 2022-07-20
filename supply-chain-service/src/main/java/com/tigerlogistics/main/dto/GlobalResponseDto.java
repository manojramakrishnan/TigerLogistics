package com.tigerlogistics.main.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tigerlogistics.main.model.EditValidation;
import com.tigerlogistics.main.model.Model;

public class GlobalResponseDto<T extends Model<? extends Serializable>> {
	
	private GlobalResponseStatus result = GlobalResponseStatus.OK;
	private List<EditValidation> errorDetails = new ArrayList<>();
	private List<T> data = new ArrayList<>();

	public GlobalResponseDto() {
	}

	public GlobalResponseDto(String errorDetails) {
		result = GlobalResponseStatus.FAIL;
		this.errorDetails.add(new EditValidation(errorDetails));
	}

	public GlobalResponseDto(T entity, List<EditValidation> validationErrors) {
		result = GlobalResponseStatus.FAIL;
		this.errorDetails.addAll(validationErrors);
		data.add(entity);
	}

	public GlobalResponseDto(T entity) {
		data.add(entity);
	}

	public GlobalResponseDto(List<T> entities) {
		data.addAll(entities);
	}

	public GlobalResponseStatus getResult() {
		return result;
	}

	public void setResult(GlobalResponseStatus result) {
		this.result = result;
	}

	public List<EditValidation> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<EditValidation> errorDetails) {
		this.errorDetails = errorDetails;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public static enum GlobalResponseStatus {
		OK, FAIL
	}
}