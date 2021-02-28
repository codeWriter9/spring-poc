package com.ghosh.sanjay.config;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;


@SpringBootTest
@RunWith(SpringRunner.class)
public class AppConfigTest {

	private static Logger LOG = getLogger(lookup().lookupClass());	

	@Test
	public void contextLoads() {
		LOG.info("context Loads");
	}
}


