package poc.spring.swagger;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class App {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = SpringApplication.run(App.class, args);
	}
}