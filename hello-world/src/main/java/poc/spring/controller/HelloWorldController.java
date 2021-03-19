package poc.spring.controller;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import poc.spring.service.HelloWorldService;
import poc.spring.service.IService;

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
	 *
	 * Using hello world Service to return the message
	 *
	 **/
	@Autowired
	protected IService helloWorldService;

	/**
	 * 
	 * Rest Controller
	 * 
	 * @return String
	 */
	@GetMapping("/helloWorld")
	public String helloWorld() {
		LOG.info("returning from GET method");
		return helloWorldService.service();
	}

	/**
	 *
	 * Post Mapping
	 *
	 * @Param String Guest
	 * @return String
	 **/
	@PostMapping("/hello")
	public String hello(@RequestBody String guest) {
		LOG.info("Hello " + guest);
		return "Hello " + guest;
	}
}
