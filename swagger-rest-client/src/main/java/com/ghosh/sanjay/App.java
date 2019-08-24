package com.ghosh.sanjay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
public class App implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(App.class.getName());
	
	@Override
	public void run(String... args) throws Exception {		
		LOG.info("Server Started !!");
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}