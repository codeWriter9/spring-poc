package poc.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data/helloWorld.properties")
public class AppConfig {
	
	@Value("${helloWorld}")
	private String helloWorld;
	
	@Bean
	public String helloWorld() {
		return helloWorld;
	}

}
