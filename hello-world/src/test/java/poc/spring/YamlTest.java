package poc.spring;

import static java.lang.Integer.valueOf;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
		ApplicationProperties.class }, initializers = ConfigFileApplicationContextInitializer.class)
@EnableConfigurationProperties
@Slf4j
public class YamlTest {

	@Autowired
	private ApplicationProperties applicationProperties;

	@SuppressWarnings("deprecation")
	@Before
	public void test() {		
		assertNotNull(applicationProperties);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkIfApplicationHasProperties() throws IOException {		
		assertEquals(valueOf(9000), applicationProperties.getPort());
	}

}
