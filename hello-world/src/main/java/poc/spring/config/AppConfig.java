package poc.spring.config;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data/helloWorld.properties")
public class AppConfig {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	@Value("${helloWorld}")
	private String helloWorld;
	
	@Bean
	public String helloWorld() {
		return helloWorld;
	}

}
