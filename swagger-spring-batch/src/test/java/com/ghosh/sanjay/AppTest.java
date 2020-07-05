package com.ghosh.sanjay;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 
 * Unit test for simple App.
 * 
 */
@ExtendWith(SpringExtension.class)
public class AppTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Mock
	private App app;

	@Before
	public void before() {
		
	}
	
	@Test
	public void canApplicationRun() {
		try {
			app.run(new String [] {});
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}
	}

	@Test
	public void hasApplicationLoaded() {
		App.main(new String[0]);
	}

	@After
	public void after() {
		app = null;
	}
}