package example.springdata.jpa.simple;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableJpaRepositories(basePackages = "example.springdata.jpa.simple")
//@TestPropertySource("application-test.properties")
//@EnableTransactionManagement
public class TestUserConfig {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	/*
	@Autowired
    private Environment env;
    
    @Bean
    public DataSource dataSource() {
    	LOG.info("---------------------------------------------------");
		LOG.info("env:" + env);
		LOG.info("---------------------------------------------------");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));

        return dataSource;
    }
    */

}
