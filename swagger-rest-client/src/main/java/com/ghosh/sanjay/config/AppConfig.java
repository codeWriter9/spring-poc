package com.ghosh.sanjay.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AppConfig {

	@Bean("restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder(restTemplateCustomizer()).basicAuthentication("admin", "admin").build();
	}

	@Bean
	public RestTemplateCustomizer restTemplateCustomizer() {
		return (restTemplate) -> {
			// TODO
		};
	}
}