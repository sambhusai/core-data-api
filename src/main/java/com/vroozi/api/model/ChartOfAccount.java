package com.vroozi.api.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.wordnik.swagger.annotations.ApiModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel
@Getter
@Setter
@EqualsAndHashCode(exclude={"id", "lastUpdated"})
@ToString
@Document(collection="chart_of_accounts")
public class ChartOfAccount implements Serializable {

	private static final long serialVersionUID = 5805435742478470499L;
	
	@Id
	private String id;
	private String unitId;
	private String name;
	private String description;
	private String dateCreated;
	private String lastUpdated;
	private boolean deleted;
	private boolean active;


}
