package poc.spring.conditionals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.slf4j.LoggerFactory.getLogger;

@ExtendWith(SpringExtension.class)
public class SampleConditionTest {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	
	private SampleCondition condition;
	
	
	@BeforeEach
	public void before() {
	}
	
	@Test
	public void checkCondition() throws Exception {
		//assertTrue(condition.matches(conditionContext, annotatedTypeMetadata));
	}
}
