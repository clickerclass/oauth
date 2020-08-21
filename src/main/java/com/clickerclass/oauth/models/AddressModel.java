package com.clickerclass.oauth.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class AddressModel {
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private String address;
	private String name;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Short active;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp creationDate;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp inactiveDate;
	private Integer userId;

	public AddressModel() {
	}

}
