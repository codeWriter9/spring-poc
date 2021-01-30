package example.springdata.jpa.simple;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class JPAMain {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private SimpleUserRepository repository;

	public static void main(String[] args) {
		JPAMain jpaMain = new JPAMain();
		ApplicationContext context = SpringApplication.run(JPAMain.class, args);		
		jpaMain.repository = (SimpleUserRepository) context.getBean("simpleUserRepository");		
		LOG.info("************************");
		LOG.info(">>>" + jpaMain.repository.findByLastname("lastname"));		
		LOG.info("************************");
	}

}