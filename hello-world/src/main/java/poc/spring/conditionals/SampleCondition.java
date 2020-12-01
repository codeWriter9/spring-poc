package poc.spring.conditionals;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class SampleCondition implements Condition {	

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {		
		return "sample".equals(conditionContext.getEnvironment().getProperty("condition", (String)null));
	}
}