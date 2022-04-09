package poc.spring.controller;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import poc.spring.App;
import poc.spring.config.AppConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { AppConfig.class, App.class })
public class HelloWorldControllerTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private HelloWorldController helloWorldController;

	@Autowired
	private String helloWorld;	
	

	@BeforeEach
	public void setUp() {
		LOG.info(" helloWorldController = " + helloWorldController.helloWorld());
	}

	@Test
	public void testHelloWorldController() {
		assertEquals(helloWorld, helloWorldController.helloWorld());
	}

	@Test
	public void testHelloGuest() {
		assertEquals("Hello Guest", helloWorldController.hello("Guest"));
	}

	@AfterEach
	public void destroy() {
		helloWorldController = null;
	}

}
