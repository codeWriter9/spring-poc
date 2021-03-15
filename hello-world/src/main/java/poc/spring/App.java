package poc.spring;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.io.IOException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import poc.spring.service.IService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {

	private static Logger LOG = getLogger(lookup().lookupClass());
	
	@Autowired
	private IService service;
	
	@Override
	public void run(String... args) throws Exception {
		LOG.info(service.service());
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(App.class, args);
	}
}
