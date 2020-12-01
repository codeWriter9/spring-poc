package poc.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Getter 
@Setter
@ConfigurationProperties(prefix="application")
public class ApplicationProperties {
	
	private Integer port;

}
