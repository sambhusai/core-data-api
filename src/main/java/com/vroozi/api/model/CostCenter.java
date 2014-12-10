package com.vroozi.api.model;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
public class CostCenter {

	@Id
	private String id;
	
	private String name;
	private String description;
	
	private ChartOfAccount chartOfAccount;
}
