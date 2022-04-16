package example.springdata.jpa.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringJUnitConfig
@ExtendWith(SpringExtension.class)
public class ApplicationContextTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testContext() {
		assertThat(applicationContext).isNotNull();
	}

}
