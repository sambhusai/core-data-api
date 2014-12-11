package com.vroozi.api.model;

import java.io.Serializable;
import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@EqualsAndHashCode(exclude={"id", "lastUpdated"})
@ToString
@Document(collection="cost_centers")
public class CostCenter implements Serializable{

	private static final long serialVersionUID = 7807229253557031579L;

	@Id
	private String id;
	private String unitId;
	private String code;
	private String name;
	private String description;
	private String companyCode;
	private String profitCenter;
	private Date dateCreated;
	private Date lastUpdated;
	private Boolean deleted;
	private Boolean active;
	
}
