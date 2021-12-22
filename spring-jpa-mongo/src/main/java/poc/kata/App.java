package poc.kata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import poc.kata.domain.User;
import poc.kata.repository.UserRepository;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner 
{


    @Autowired
    private UserRepository userRepository;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception 
    {
	System.out.println( "------------" );
	System.out.println( userRepository.findAll() );
	System.out.println( "------------" );
    }

}
