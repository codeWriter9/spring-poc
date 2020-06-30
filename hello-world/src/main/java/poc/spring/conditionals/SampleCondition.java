package poc.spring.conditionals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

@ConfigurationProperties("classpath:helloWorld.properties")
public class SampleCondition implements Condition {
	
	@Value("feed")
	private String feed;

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		System.out.println(" feed " + feed);
		return true;
	}

}
