package example.springdata.jpa.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class SimpleUserController {
	
	@Autowired  
	private SimpleUserService simpleUserService;

}
