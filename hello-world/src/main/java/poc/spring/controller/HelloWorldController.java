package poc.spring.controller;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private String helloWorld;

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return helloWorld;
	}
}