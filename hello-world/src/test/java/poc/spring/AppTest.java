package poc.spring;

import static poc.spring.App.main;

import java.io.IOException;
import java.lang.invoke.MethodHandles;

import org.junit.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private static Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Mock
	private App app;

	@Test
	public void shouldAnswerWithTrue() throws IOException {
		main(new String[] {});
	}

}
