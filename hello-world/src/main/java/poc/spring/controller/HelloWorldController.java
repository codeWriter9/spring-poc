package poc.spring.controller;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * REST Controller 
 * 
 * @author Sanjay Ghosh
 *
 */
@RestController
public class HelloWorldController {

	private static Logger LOG = getLogger(lookup().lookupClass());

	/**
	 * 
	 * Using the String property as a bean
	 * 
	 */
	@Autowired
	protected String helloWorld;

	/**
	 * 
	 * Rest Controller
	 * 
	 * @return String
	 */
	@GetMapping("/helloWorld")
	public String helloWorld() {
		LOG.info("returning from GET method");
		return helloWorld;
	}
}