package com.ghosh.sanjay.config;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
		"/config/application-context.xml" })
public class AppConfigTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	// @Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;
	
	@Autowired
	private Job tradeJob;
	
	@Autowired	
	private JobLauncher jobLauncher;	
	
	private JobRepository jobRepository;

	@BeforeEach
	public void setUp() {
		LOG.info(" tradeJob  " + tradeJob);
		LOG.info(" jobLauncher  " + jobLauncher);
		LOG.info(" jobRepository  " + jobRepository);
		jobLauncherTestUtils = new JobLauncherTestUtils();
		jobLauncherTestUtils.setJob(tradeJob);
		jobLauncherTestUtils.setJobLauncher(jobLauncher);
		jobLauncherTestUtils.setJobRepository(jobRepository);
	}

	@Test
	public void shouldAnswerWithTrue() throws Exception {
		try {
			jobLauncherTestUtils.launchJob();
			assertTrue(true);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}
	}

	@AfterEach
	public void destroy() {
		jobLauncherTestUtils = null;
	}
}
