package poc.kata.domain;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = {User.class})
public class UserTest {

	private User user;

	@BeforeEach
	public void setUp() {
		user = new User();
		user.setName("Name");
		user.setLocation("Location");
		user.setUsername("Username");
	}

	@Test
	public void testUser() {
		assertEquals("Name", user.getName());
		assertEquals("Location", user.getLocation());
		assertEquals("Username", user.getUsername());
	}


	@AfterEach
	public void destroy() {
		user = null;
	}


}
