package poc.spring.service;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import poc.spring.App;
import poc.spring.config.AppConfig;

@SpringJUnitConfig(classes = {AppConfig.class, HelloWorldService.class})
public class ServiceTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private IService  helloWorldService;

	@Autowired
	private String helloWorld;	
	
	@BeforeEach
	public void setUp() {
	}

	@Test
	public void testHelloWorldService() {
		assertEquals(helloWorld, helloWorldService.service());
		assertNotNull(helloWorldService);
		assertNotNull(helloWorld);
	}
	
	@AfterEach
	public void destroy() {
		helloWorldService = null;
		helloWorld = null;
	}

}
