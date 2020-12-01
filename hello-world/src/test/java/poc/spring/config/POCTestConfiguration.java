package poc.spring.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.DirtiesContext;

import poc.spring.conditionals.SampleCondition;
import poc.spring.service.HelloWorldService;
import poc.spring.service.IService;

@TestConfiguration
@Profile("test")
@DirtiesContext
public class POCTestConfiguration {
	
	@Bean
	@Primary
	@Conditional(SampleCondition.class)
	public String helloWorld() {
		return "helloWorld!";
	}
	
	@Bean
	@Primary
	@Conditional(SampleCondition.class)
	public IService helloWorldService() {
		return new HelloWorldService();
	}

}
