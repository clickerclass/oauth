package com.clickerclass.oauth.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

import java.util.Date;

@Data
public class UserModel {

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private DocumentTypeModel documentTypeModel;
	private String document;
	private String email;
	private String userName;
	private String name;
	private String lastName;
	private Date birthDate;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	private List<RolModel> roles;

	public UserModel() {
	}



}
