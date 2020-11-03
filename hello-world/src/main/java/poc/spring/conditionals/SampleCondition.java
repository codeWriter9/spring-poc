package poc.spring.conditionals;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

@ConfigurationProperties("classpath:helloWorld.properties")
public class SampleCondition implements Condition {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	@Value("feed")
	private String feed;

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {		
		LOG.info(" feed " + feed);
		LOG.info(" env " + conditionContext.getEnvironment());		
		return true;
	}
}