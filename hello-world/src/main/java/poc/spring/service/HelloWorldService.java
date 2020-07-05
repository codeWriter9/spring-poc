package poc.spring.service;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

public class HelloWorldService implements IService {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	public void service() {
		LOG.info(" -- serving the world -- ");
	}

}