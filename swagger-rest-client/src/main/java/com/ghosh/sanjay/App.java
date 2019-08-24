package com.ghosh.sanjay;

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
	
	@Override
	public void run(String... args) throws Exception {		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
