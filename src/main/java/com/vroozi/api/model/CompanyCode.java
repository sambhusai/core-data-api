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
@Document(collection="company_codes")
public class CompanyCode implements Serializable{
	
	private static final long serialVersionUID = 8161184275786722261L;
	
	@Id
	private String id;
	private String unitId;
	private String name;
	private String description;
	private String addressName;
	private String currencyCode;
	private String taxJurisdiction;
	private String vatRegistrationNumber;
	private Date dateCreated;
	private Date lastUpdated;
	private boolean deleted;
	private boolean active;
	
}
