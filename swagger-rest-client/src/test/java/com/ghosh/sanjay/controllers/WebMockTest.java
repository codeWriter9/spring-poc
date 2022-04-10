package com.ghosh.sanjay.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.ghosh.sanjay.App;
import com.ghosh.sanjay.config.AppConfig;

//@RunWith(SpringRunner.class)
//@WebMvcTest
//@ContextConfiguration(classes = { AppConfig.class, App.class })
public class WebMockTest {
	
	@Autowired
	private MockMvc mockMvc;

	//@MockBean
	//private RestTemplate restTemplate;

	@Autowired	
	private String url;

	@Autowired
	private SendController sendController;

	@Autowired
	private UploadController uploadController;
	
	@BeforeEach
	public void checkNotNull() throws Exception {
		assertThat(sendController).isNotNull();
		assertThat(uploadController).isNotNull();	
		//assertThat(restTemplate).isNotNull();	
		assertThat(mockMvc).isNotNull();		
	}

	@Test
	public void checkSendPostMethod() throws Exception {
		//ResponseEntity<String> myEntity = new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		//Mockito.when(restTemplate.exchange(Matchers.any(),Matchers.eq(HttpMethod.POST),Matchers.<HttpEntity<String>>any(),Matchers.<ParameterizedTypeReference<String>>any()) ).thenReturn(myEntity);
		//this.mockMvc.perform(post("/send?name=Code")).andDo(print()).andExpect(status().isOk());
	}



	@AfterEach
	public void releaseObjects() {
		
	}

}	
