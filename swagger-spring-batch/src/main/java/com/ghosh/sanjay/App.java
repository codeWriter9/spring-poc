package com.ghosh.sanjay;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {

	private static Logger LOG = getLogger(lookup().lookupClass());

	private ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		context = new ClassPathXmlApplicationContext("config/application-context.xml");
		LOG.info("Application Context has been loaded ! ");
		// asList(context.getBeanDefinitionNames()).forEach((bean) -> LOG.info("bean :"
		// + bean));
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("tradeJob");
		launcher.run(job, new JobParameters());
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
