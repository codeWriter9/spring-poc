package poc.spring;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static poc.spring.App.main;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit test for simple App.
 */

public class AppTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Mock
	private App app;

	@Autowired
	private String helloWorld;

	@Before
	public void test() {
		System.setProperty("feed", "feed");
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
