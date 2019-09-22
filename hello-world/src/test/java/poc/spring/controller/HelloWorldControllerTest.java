package poc.spring.controller;

import java.lang.invoke.MethodHandles;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import poc.spring.App;
import poc.spring.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class, App.class })
public class HelloWorldControllerTest {

	private static Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	private HelloWorldController helloWorldController;
	
	@Autowired
	private String helloWorld;

	@Before
	public void setUp() {
		LOG.info(" helloWorldController = " + helloWorldController.helloWorld());
	}

	@Test
	public void testHelloWorldController() {
		Assert.assertEquals(helloWorld, helloWorldController.helloWorld());
	}

	@After
	public void destroy() {
		helloWorldController = null;
	}

}