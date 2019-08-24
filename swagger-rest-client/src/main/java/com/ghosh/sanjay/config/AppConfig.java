package com.ghosh.sanjay.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan("com.ghosh.sanjay")
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() {		
		return new RestTemplateBuilder(restTemplateCustomizer()).basicAuthentication("admin", "admin")
				.build();
	}

	@Bean
	public RestTemplateCustomizer restTemplateCustomizer() {
		return (restTemplate) -> {
			// TODO 
		};
	}

}
