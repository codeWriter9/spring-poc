package example.springdata.jpa.simple;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	@Autowired 
	private SimpleUserRepository repository;
	private User user;
	
	@BeforeEach
	public void setUp() {
		user = new User();
		user.setUsername("foobar");
		user.setFirstname("firstname");
		user.setLastname("lastname");
	}
	
	@Test
	public void testUser() {
		assertNotNull(repository);
		user = repository.save(user);
		assertNotNull(user);
		assertEquals("firstname", user.getFirstname());
		assertEquals("lastname", user.getLastname());
		assertEquals("foobar", user.getUsername());
	}
	
	@AfterEach
	public void destroy() {
		
	}
}
