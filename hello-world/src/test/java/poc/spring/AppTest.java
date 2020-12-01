package poc.spring;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static poc.spring.App.main;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import poc.spring.service.HelloWorldService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AppTest {

	private static Logger LOG = getLogger(lookup().lookupClass());
	
	@Mock
	private HelloWorldService service;

	@InjectMocks
	private App app;

	@Autowired
	private String helloWorld;

	@Before
	public void test() {
		
	}
	
	@Test
	public void checkIfThisRuns() throws Exception {
		try {
			app.run(new String[] {});
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}
	}

	@Test
	public void thisJustChecksIfApplicationStarts() throws IOException {
		try {
			main(new String[] {});
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}
	}

}
