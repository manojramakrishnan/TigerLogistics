package com.tigerlogistics.rawmaterial.order.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateStatusDTO {
	@NotNull
	private Long orderId;
	@NotBlank
	@Pattern(regexp = "^(Delivered|Cancelled)$", message = "Delivery status must be 'Delivered' or 'Cancelled")
	private String status;

}
