package com.clickerclass.oauth.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.clickerclass.oauth.models.AuthenticationModel;

@FeignClient(name="userService")
public interface UserRepository {
	@PostMapping("/authentication")
	public AuthenticationModel searchByUser(
			@RequestParam("userName")String userName,@RequestParam("email")String email);
}
