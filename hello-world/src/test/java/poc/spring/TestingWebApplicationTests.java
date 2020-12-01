package poc.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import poc.spring.controller.HelloWorldController;
import poc.spring.service.HelloWorldService;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.Assert.*;
import static org.slf4j.LoggerFactory.getLogger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestingWebApplicationTests {

	private static Logger LOG = getLogger(lookup().lookupClass());	

	@Autowired
	private HelloWorldController controller;

	@Autowired
	private HelloWorldService service;

	@Before
	public void before() {

	}

	@Test
	public void contextLoads() {
		assertNotNull(controller);
		assertNotNull(service);
	}
	
	@After
	public void after() {
		controller = null;
		service = null;
	}
}