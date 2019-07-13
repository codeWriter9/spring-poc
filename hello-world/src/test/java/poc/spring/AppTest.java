package poc.spring;

import static poc.spring.App.main;

import org.junit.Test;
import org.mockito.Mock;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Mock
	private App app;

	@Test
	public void shouldAnswerWithTrue() {
		main(new String[] {});
	}

}
