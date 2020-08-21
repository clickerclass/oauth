package com.clickerclass.oauth.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DocumentTypeModel {

	private Integer id;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private String name;

	public DocumentTypeModel() {
	}

}
