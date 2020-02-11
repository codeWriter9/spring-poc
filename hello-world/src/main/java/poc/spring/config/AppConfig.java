package poc.spring.config;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * App Configuration which loads the configuration
 * We are using <code>@Configuration</code> and 
 * <code>@PropertySource</code> to load the configuration
 * 
 * @author Sanjay Ghosh
 *
 */
@Configuration
@PropertySource("classpath:data/helloWorld.properties")
public class AppConfig {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	/**
	 * 
	 * Read the property from the property files
	 * 
	 */
	@Value("${helloWorld}")
	private String helloWorld;
	
	/**
	 * 
	 * Instead of hard coding we are setting the hello world as a bean in the context
	 * 
	 * @return String
	 */
	@Bean
	public String helloWorld() {
		return helloWorld;
	}

}
