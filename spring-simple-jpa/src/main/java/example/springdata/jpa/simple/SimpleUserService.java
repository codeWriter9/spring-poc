package example.springdata.jpa.simple;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleUserService {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	@Autowired
	private SimpleUserRepository simpleUserRepository;
	
	public List<User> findUserByLastName(String lastName) {
		LOG.info("---------------------------------------------------");
		LOG.info("simpleUserRepository:" + simpleUserRepository);
		LOG.info("---------------------------------------------------");
		return simpleUserRepository.findByLastname(lastName);
	}

}
