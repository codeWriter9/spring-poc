package com.ghosh.sanjay;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{

    private static Logger LOG = getLogger(lookup().lookupClass());

    @Override
    public void run(String... args) throws Exception {
	LOG.info("Hello World");
    }

    public static void main( String[] args )
    {
	SpringApplication.run(App.class, args);
    }
}
