package com.ghosh.sanjay;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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

	@BeforeEach
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

	@AfterEach
	public void after() {
		app = null;
	}
}
