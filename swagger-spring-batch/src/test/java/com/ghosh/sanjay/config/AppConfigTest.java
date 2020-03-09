package com.ghosh.sanjay.config;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "/job-runner-context.xml", "/jobs/tradeJob.xml",
		"/simple-job-launcher-context.xml" })
public class AppConfigTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;

	@Test
	public void shouldAnswerWithTrue() throws Exception {
		//jobLauncherTestUtils.launchJob();
		assertTrue(true);
	}

}