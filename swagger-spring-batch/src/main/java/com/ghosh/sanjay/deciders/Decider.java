package com.ghosh.sanjay.deciders;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.batch.core.job.flow.FlowExecutionStatus.COMPLETED;

import org.slf4j.Logger;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

public class Decider implements JobExecutionDecider {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
		LOG.info(" jobExecution " + jobExecution);
		LOG.info(" stepExecution " + stepExecution);
		return COMPLETED;
	}

}