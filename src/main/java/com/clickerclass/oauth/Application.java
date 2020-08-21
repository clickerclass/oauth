package com.clickerclass.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = { "com.clickerclass.oauth", "com.gema.autentication" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
