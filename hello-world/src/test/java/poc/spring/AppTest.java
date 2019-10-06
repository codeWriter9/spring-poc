package poc.spring;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static poc.spring.App.main;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mock;
import org.slf4j.Logger;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Mock
	private App app;

	@Test
	public void thisJustChecksIfApplicationStarts() throws IOException {
		main(new String[] {});
	}

}
