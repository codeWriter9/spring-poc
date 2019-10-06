package com.ghosh.sanjay.config;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@PropertySource("classpath:rest.properties")
@Component
public class AppConfig {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Value("${rest.client.basic.auth.username}")
	private String userName;

	@Value("${rest.client.basic.auth.password}")
	private String password;

	@Value("${rest.client.base.url}")
	private String url;

	@Value("${rest.service.controllers.base}")
	private String basePackage;

	@Value("classpath:${rest.schema.base}")
	private Resource schemaFile;

	@Bean
	public Schema schema() {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(schemaFile.getInputStream()))) {
			return SchemaLoader.load(new JSONObject(new JSONTokener(reader)));
		} catch (JSONException | IOException e) {
			LOG.error(e.getMessage());
			return null;
		}
	}

	@Bean("restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder(restTemplateCustomizer()).basicAuthentication(userName, password).build();
	}

	@Bean
	public String url() {
		return url;
	}

	@Bean
	public RestTemplateCustomizer restTemplateCustomizer() {
		return (restTemplate) -> {

		};
	}

	HttpHeaders headers(MediaType mediaType) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(mediaType));
		return headers;
	}

	@Configuration
	@EnableSwagger2
	public class SwaggerConfig {
		@Bean
		public Docket api() {
			return new Docket(SWAGGER_2).select().apis(basePackage(basePackage)).paths(any()).build();
		}
	}
}