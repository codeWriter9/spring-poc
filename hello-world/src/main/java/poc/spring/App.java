package poc.spring;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
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

	private static Logger LOG = LoggerFactory.getLogger("App");

	private static Resource fileResource;

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}

	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = SpringApplication.run(App.class, args);
		Resource[] resources = applicationContext.getResources("classpath*:data/helloWorld.properties");
		for (Resource r : resources) {
			LOG.info(" File Loaded! " + r);
			fileResource = r;
		}
		Runtime.getRuntime().addShutdownHook(new Thread(shutDownHook()));
	}

	public static Runnable shutDownHook() {
		return () -> {
			if(fileResource != null) {
				try {
					fileResource.getInputStream().close();
				}
				catch(Exception e) {
					LOG.error(" Exception thrown while closing " + fileResource);
					return;
				}
				LOG.error(" File Stream closed!! ");
			}
		};
	}
}