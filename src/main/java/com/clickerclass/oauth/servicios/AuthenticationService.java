package com.clickerclass.oauth.servicios;

import java.util.List;
import java.util.stream.Collectors;

import com.clickerclass.oauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gema.autentication.model.AuthenticationSecurityRequest;
import com.gema.autentication.model.AuthenticationSecurityResponse;
import com.gema.autentication.security.config.ApplicationConfig;
import com.gema.autentication.security.service.SecurityProcessJwt;
import com.clickerclass.oauth.models.AuthenticationModel;

@Service
public class AuthenticationService extends SecurityProcessJwt {

	@Autowired
	private UserRepository userRepository;
	

	@Override
	public AuthenticationSecurityResponse generateSecurity(AuthenticationSecurityRequest authenticationSecurityrequest,
			ApplicationConfig applicationConfig) {
		AuthenticationModel authentication = userRepository.searchByUser(
				authenticationSecurityrequest.getUsername(), authenticationSecurityrequest.getUsername());
		List<String> listRoles = authentication.getUser().getRoles().stream().map(x -> x.getName())
				.collect(Collectors.toList());
		return buildAuthenticationSecurityResponse(authenticationSecurityrequest, authentication.getPassword(),
				listRoles, applicationConfig);
	}

}
