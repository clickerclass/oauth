package com.clickerclass.oauth.models;

import lombok.Data;

@Data
public class AuthenticationModel {
	private String password;
	private UserModel user;
	public AuthenticationModel() {
		super();
	}
	
	
}
