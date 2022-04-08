package poc.spring;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
		ApplicationProperties.class }, initializers = ConfigFileApplicationContextInitializer.class)
@EnableConfigurationProperties
@Slf4j
public class YamlTest {

	@Autowired
	private ApplicationProperties applicationProperties;

	@SuppressWarnings("deprecation")
	@BeforeEach
	public void test() {		
		assertNotNull(applicationProperties);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkIfApplicationHasProperties() throws IOException {		
		assertEquals(valueOf(9000), applicationProperties.getPort());
	}

}
