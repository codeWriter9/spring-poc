package poc.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class App
{
	private static Logger LOG = LoggerFactory.getLogger("App");
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
	
    public static void main( String[] args )
    {
    	LOG.info( "Hello World!" );
    	ApplicationContext context = SpringApplication.run(App.class, args);
    }
}
