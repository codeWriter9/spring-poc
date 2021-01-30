package example.springdata.jpa.simple;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = { TestUserConfig.class }, loader = AnnotationConfigContextLoader.class)
//@Transactional
public class SimpleUserServiceTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private SimpleUserService simpleUserService;

	@Before
	public void before() {
//		assertNotNull(simpleUserService);
	}

	@Test
	public void testFindUserByLastName() {
//		List<CustomUser> users = simpleUserService.findUserByLastName("lastname");
//		assertNotNull(users);
//		LOG.info("---------------------------------------------------");
//		LOG.info("users:" + users);
//		LOG.info("---------------------------------------------------");
	}

	@After
	public void after() {

	}

}
