package poc.spring.service;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldService implements IService {
	
	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private String helloWorld;
	
	public String service() {
		LOG.info(" -- serving the world -- ");
		return helloWorld;
	}

}
