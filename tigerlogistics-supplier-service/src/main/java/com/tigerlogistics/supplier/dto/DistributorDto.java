package com.tigerlogistics.supplier.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DistributorDto {

	  private Long distributorId;
	  private String name;
	  private String location;
	  private String phoneNo;

}
