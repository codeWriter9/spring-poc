package poc.spring;

import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@TestPropertySource("classpath:data/helloWorld.properties")
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
public class HelloWorldPropertyConfigurationTest {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	/**
	 * 
	 * Read the property from the property files
	 * 
	 */
	@Value("${helloWorld}")
	private String helloWorld;
	
	@Test
	public void testHelloWorldPropertyConfig() {
		assertThat(helloWorld).isNotNull();
		assertThat(helloWorld).isNotBlank();
		assertThat(helloWorld).isEqualTo("helloWorld!");
	}

}
