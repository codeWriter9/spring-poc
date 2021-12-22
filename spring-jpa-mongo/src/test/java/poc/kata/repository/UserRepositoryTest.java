package poc.kata.repository;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.MongoRepository;

import poc.kata.App;
import poc.kata.domain.User;


@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository  userRepository;

	@BeforeEach
	public void setUp() {
		userRepository.deleteAll();

                userRepository.save(new User("Dave", "New York" ,"Matthews"));
                userRepository.save(new User("Oliver August", "Tokyo", "Matthews"));
                userRepository.save(new User("Carter", "Orlando", "Beauford"));
	}

	@Test
	public void test() {
		assertNotNull(userRepository);
	}

	@AfterEach
	public void destroy() {
		userRepository = null;
	}

}
