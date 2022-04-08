package poc.spring.conditionals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.slf4j.LoggerFactory.getLogger;

//@RunWith(MockitoJUnitRunner.class)
public class SampleConditionTest {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	
	private SampleCondition condition;
	
	@Mock
	private ConditionContext conditionContext;
	
	@Mock
    private AnnotatedTypeMetadata annotatedTypeMetadata;
	
	@Mock
	private Environment env;
	
	@BeforeEach
	public void before() {
		condition = new SampleCondition();		
		when(conditionContext.getEnvironment()).thenReturn(env);
		when(env.getProperty(anyString(), nullable(String.class))).thenReturn("sample");
	}
	
	@Test
	public void checkCondition() throws Exception {
		assertTrue(condition.matches(conditionContext, annotatedTypeMetadata));
	}
}
